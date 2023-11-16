package com.example.yin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.yin.model.domain.Admin;
import com.example.yin.model.request.AdminRequest;

import javax.servlet.http.HttpSession;

/**
 * @author Hlmove
 */
public interface AdminService extends IService<Admin> {

    void verityPasswd(AdminRequest adminRequest, HttpSession session);
}
