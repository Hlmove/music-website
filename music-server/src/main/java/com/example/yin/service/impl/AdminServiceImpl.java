package com.example.yin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.yin.mapper.AdminMapper;
import com.example.yin.model.domain.Admin;
import com.example.yin.model.request.AdminRequest;
import com.example.yin.service.AdminService;
import com.example.yin.utils.Result.ResultCode;
import com.example.yin.utils.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void verityPasswd(AdminRequest adminRequest, HttpSession session) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",adminRequest.getUsername());
        queryWrapper.eq("password",adminRequest.getPassword());
        if (adminMapper.selectCount(queryWrapper) > 0) {
            session.setAttribute("name", adminRequest.getUsername());
        } else {
           throw  new ServiceException(ResultCode.USER_LOGIN_ERROR);
        }
    }
}
