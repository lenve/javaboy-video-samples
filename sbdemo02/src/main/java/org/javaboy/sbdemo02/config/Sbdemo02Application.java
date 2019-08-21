package org.javaboy.sbdemo02.config;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "")
public class Sbdemo02Application {

    public static void main(String[] args) {
//        SpringApplication.run(Sbdemo02Application.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Sbdemo02Application.class);
        SpringApplication build = builder.build();
        build.setBannerMode(Banner.Mode.OFF);
        build.run(args);
    }
}
