package com.example.yin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Hlmove
 */
@Component
@Data
@ConfigurationProperties(prefix = "sky.tencentcos")
public class TencentCosProperties {
    // COS的SecretId
    private String secretId;
    // COS的SecretKey
    private String secretKey;
    //文件上传后访问路径的根路径，后面要最佳文件名字与类型
    private String rootSrc;
    //上传的存储桶的地域，此参数在COS的后台能查询。
    private String bucketAddr;
    //存储桶的名字
    private String bucketName;
//    //存储桶存放文件的文件夹名称
//    private String bucketImgName;
}
