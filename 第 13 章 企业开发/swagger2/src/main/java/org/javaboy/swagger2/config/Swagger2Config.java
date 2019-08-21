package org.javaboy.swagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 19:58
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.javaboy.swagger2.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .description("接口文档的描述信息")
                        .title("微人事项目接口文档")
                        .contact(new Contact("javaboy","http://www.javaboy.org","wangsong0210@gmail.com"))
                        .version("v1.0")
                        .license("Apache2.0")
                        .build());
    }
}
