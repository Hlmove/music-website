package com.example.yin.controller;

import com.example.yin.service.BannerService;
import com.example.yin.utils.Result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 祝英台炸油条
 * @Time : 2022/6/13 13:16
 **/
@RestController
@RequestMapping("/banner")
@RequiredArgsConstructor
public class BannerController {

    private final BannerService bannerService;


    @GetMapping("/getAllBanner")
    public Result getAllBanner() {
//        return R.success("成功获取轮播图与", bannerService.getAllBanner());
        return Result.success(bannerService.getAllBanner());
    }
}
