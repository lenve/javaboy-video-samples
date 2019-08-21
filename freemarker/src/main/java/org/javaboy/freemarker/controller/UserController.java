package org.javaboy.freemarker.controller;

import org.javaboy.freemarker.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-20 7:00
 */
@Controller
public class UserController {
    @GetMapping("/user")
    public String user(Model model) {
        List<User> users = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setUsername("javaboy>>>" + i);
            user.setAddress("www.javaboy.org>>>" + i);
            user.setGender(random.nextInt(3));//0 表示 男 1 表示 女 其他数字表示未知
            users.add(user);
        }
        model.addAttribute("users", users);
        model.addAttribute("hello", "<h1>hello</h1>");
        model.addAttribute("world", "<h1>world</h1>");
        return "user";
    }
}
