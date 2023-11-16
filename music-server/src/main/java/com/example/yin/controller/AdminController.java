package com.example.yin.controller;

import com.example.yin.model.request.AdminRequest;
import com.example.yin.service.AdminService;
import com.example.yin.utils.Result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 后台管理的相关事宜
 * @date 2023/11/15 14:17
 * @author Hlmove
 */
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;


    // 判断是否登录成功
    @PostMapping("/login/status")
    public Result loginStatus(@RequestBody AdminRequest adminRequest, HttpSession session) {
        adminService.verityPasswd(adminRequest, session);
        return Result.success();
    }
}
