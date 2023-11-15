package com.example.yin.controller;


import com.example.yin.utils.Result.Result;
import com.example.yin.utils.TencentCosUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@Slf4j
@RestController
@RequestMapping("/ten/")
@Api(tags = "上传")
public class CommonController {
    @Autowired
    private TencentCosUtil tencentCosUtil;
    @PostMapping("/upload")
    public Result upload(@RequestPart MultipartFile file) {
        log.info("上传文件为：{}", file);
        String url = tencentCosUtil.upLoadFile(file,"/image");
        return Result.success(url);
    }
}
