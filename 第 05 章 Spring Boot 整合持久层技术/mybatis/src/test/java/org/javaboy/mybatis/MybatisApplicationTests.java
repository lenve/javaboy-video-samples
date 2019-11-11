package org.javaboy.mybatis;

import org.javaboy.mybatis.bean.User;
import org.javaboy.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        List<User> allUser = userMapper.getAllUser();
        System.out.println(allUser);
    }

}
