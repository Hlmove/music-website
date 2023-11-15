package com.example.yin.utils.exception;


import com.example.yin.utils.Result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {
        Result result = null;
        if (e instanceof ServiceException) {
            log.error(e.getMessage());
            result = Result.failure(((ServiceException) e).getResultCode());
        }else if (e instanceof DuplicateKeyException){
            result = Result.failure(500,"该数据已存在,请检查后重新输入!");
        } else {
            log.error(e.getMessage());
            e.printStackTrace();
            result = Result.failure(500, "服务器意外错误：" + e.getMessage());
        }
        return result;
    }
}
