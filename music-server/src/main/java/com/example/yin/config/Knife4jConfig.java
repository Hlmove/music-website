package com.example.yin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Hlmove
 * @date 创建日期 2023/11/14 10:50
 * @Description com.hlmove.core
 * @Note
 */
@Configuration
@EnableSwagger2
public class Knife4jConfig {
    //Swagger界面中显示的基本信息
    private ApiInfo apiInfo(){
        //配置基本信息
        Contact briup = new Contact("briup", "http://www.briup.com/index.php/", "briup@briup.com");
        return new ApiInfoBuilder()
                //标题
                .title("CMS内容管理系统")
                .description("欢迎访问CMS接口文档")
                //基本信息
                .contact(briup)
                //版本号
                .version("1.0.0")
                //创建
                .build();
    }

    //配置Controller的包路径
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //传入要扫描的包结构
                .apis(RequestHandlerSelectors.basePackage("com.example.yin.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
