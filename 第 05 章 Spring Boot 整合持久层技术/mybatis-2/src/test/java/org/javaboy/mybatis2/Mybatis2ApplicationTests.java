package org.javaboy.mybatis2;

import org.javaboy.mybatis2.bean.User;
import org.javaboy.mybatis2.mapper1.UserMapper1;
import org.javaboy.mybatis2.mapper2.UserMapper2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Mybatis2ApplicationTests {

    @Autowired
    UserMapper2 userMapper2;
    @Autowired
    UserMapper1 userMapper1;
    @Test
    public void contextLoads() {
        List<User> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
        List<User> allUsers1 = userMapper2.getAllUsers();
        System.out.println(allUsers1);
    }

}
