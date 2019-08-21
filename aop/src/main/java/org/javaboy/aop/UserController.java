package org.javaboy.aop;

import org.javaboy.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-26 7:35
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/test1")
    public String getUsernameById(Integer id) {
        return userService.getUsernameById(id);
    }

    @GetMapping("/test2")
    public void deleteUserById(Integer id) {
        userService.deleteUserById(id);
    }
}
