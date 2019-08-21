package org.javaboy.mybatis.controller;

import org.javaboy.mybatis.bean.User;
import org.javaboy.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-06 20:06
 */
@RestController
public class HelloController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/test1")
    public void test1() {
        List<User> allUser = userMapper.getAllUser();
        System.out.println(allUser);
        List<User> allUser2 = userMapper.getAllUser();
        System.out.println(allUser2);
    }
    @GetMapping("/test2")
    public void test2() {
        List<User> allUser = userMapper.getAllUser();
        System.out.println(allUser);
        List<User> allUser2 = userMapper.getAllUser();
        System.out.println(allUser2);
    }
}
