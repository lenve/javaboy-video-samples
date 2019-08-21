package org.javaboy.security.controller;

import org.javaboy.security.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-11 9:23
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello security!";
    }

    @GetMapping("/admin/hello")
    public String admin() {
        return "hello admin!";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "hello user!";
    }

    @GetMapping("/login")
    public String login() {
        return "please login!";
    }

    @Autowired
    MethodService methodService;

    @GetMapping("/hello1")
    public String hello1() {
        return methodService.admin();
    }

    @GetMapping("/hello2")
    public String hello2() {
        return methodService.user();
    }

    @GetMapping("/hello3")
    public String hello3() {
        return methodService.hello();
    }

}
