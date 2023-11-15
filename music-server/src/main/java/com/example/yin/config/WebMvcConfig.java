package com.example.yin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 祝英台炸油条
 * @Time : 2022/6/7 17:08
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private CorsInterceptor corsInterceptor;
    List<String> knifePaths = Arrays.asList(
            "/doc.html",
            "/webjars/**",
            "/swagger-resources",
            "/v2/api-docs"
    );

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(corsInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(knifePaths);  //需要放行的资源;
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }


}
