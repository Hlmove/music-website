package com.example.yin.utils;

import com.example.yin.config.TencentCosProperties;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.auth.COSCredentials;
import com.qcloud.cos.http.HttpProtocol;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import com.qcloud.cos.region.Region;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
/**
 * @author Hlmove
 */
@Slf4j
@Data
@RequiredArgsConstructor
@Component
public class TencentCosUtil{
    private  final TencentCosProperties tcp;

    /**
     * 只要调用方法upLoadFile(MultipartFile multipartFile)就可以获取上传后文件在网络上的全路径
     *
     * @param file
     * @return 返回文件的浏览全路径
     */
    public  String upLoadFile(MultipartFile file,String filePath) {
        String path = "F:/Code2023/finalCode/music-website/music-server/src/main/resources";

        log.info("path路径为：{}",path);
        log.info("当前程序所在目录：{}",System.getProperty("user.dir"));
        long size = file.getSize();
        log.info("文件大小：{}kb", size * 1.0 / 1024);
        //====================第一部分=====================
        //=================生成COS的客户端==================
        // 1 初始化用户身份信息（secretId, secretKey）。
        COSCredentials cred = new BasicCOSCredentials(tcp.getSecretId(), tcp.getSecretKey());
        // 2.1 设置存储桶的地域（上文获得）
        Region region = new Region(tcp.getBucketAddr());
        ClientConfig clientConfig = new ClientConfig(region);
        // 2.2 使用https协议传输
        clientConfig.setHttpProtocol(HttpProtocol.https);
        // 3 生成 cos 客户端。
        COSClient cosClient = new COSClient(cred, clientConfig);
        try {
            //====================第二部分=====================
            //=============创建临时文件夹存放上传的文件============
            //自定义临时文件路径
            String tempFile = path;
            //若不存在就创建文件
            File localFile = new File(tempFile);
            if (!localFile.exists()) {
                localFile.mkdirs();
            }
            // 避免文件覆盖，获取文件的原始名称，如123.jpg,然后通过截取获得文件的后缀，也就是文件的类型
            String originalFilename = file.getOriginalFilename();
            log.info("文件原始路径：{}",originalFilename);
            //获取文件的类型
//            String fileType = originalFilename.substring(originalFilename.lastIndexOf("."));
//            //使用UUID工具  创建唯一名称，放置文件重名被覆盖，在拼接上上命令获取的文件类型
//            String fileName = UUID.randomUUID().toString() + fileType;
            // 指定文件上传到 COS 上的路径，即对象键。最终文件会传到存储桶名字中的images文件夹下的fileName名字
            String localFilePath = tempFile + "/" + originalFilename;
            try {
                //文件上传临时存储位置
                file.transferTo(new File(localFilePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            //开始COS上传操作
            // 指定要上传的文件
            File localFiles = new File(localFilePath);
            System.out.println("localFiles = " + localFiles);
            //文件再存储桶中的详细路径
            /**
             * bucketName,桶名
             * key, 详细路径
             * localFiles 上传封装的文件
             */
            PutObjectRequest putObjectRequest = new PutObjectRequest(tcp.getBucketName(), filePath, localFiles);
            System.out.println("putObjectRequest = " + putObjectRequest);
            PutObjectResult putObjectResult = cosClient.putObject(putObjectRequest);
            // 创建文件的网络访问路径
            String url = tcp.getRootSrc() + filePath;
            //上传COS完成，删除上传的临时文件
            File localImageFile = new File(localFilePath);
            localImageFile.delete();
            //关闭 cosClient，并释放 HTTP 连接的后台管理线程
            cosClient.shutdown();
            return url;

        } catch (Exception e) {
            e.printStackTrace();
            // 发生IO异常、COS连接异常等，返回空
            return null;
        }
    }
}
