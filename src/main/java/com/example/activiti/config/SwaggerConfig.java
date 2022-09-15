package com.example.activiti.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 刘德意
 * @date 2022/9/13
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.enable}")
    private boolean enable;
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("activiti6")
                .enable(enable)
                .apiInfo(adminApiInfo())
                .select()
                .build();

    }

    private ApiInfo adminApiInfo() {
        return new ApiInfoBuilder()
                .title("activiti6 API文档")
                .description("activiti6 接口文档")
                .version("v1.0")
                .contact(new Contact("刘德意", "https://blog.csdn.net/weixin_43982687", "18811553417@163.com"))
                .build();
    }

}
