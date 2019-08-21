package org.javaboy.json.controller;

import org.javaboy.json.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-23 6:37
 */
//@Controller
@RestController
public class UserController {
    //    @ResponseBody
    @GetMapping("/user")
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAddress("www.javaboy.org>>" + i);
            user.setUsername("javaboy>>" + i);
            user.setId(i);
            user.setBirthday(new Date());
            users.add(user);

        }
        return users;
    }
}
