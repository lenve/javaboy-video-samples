package org.javaboy.cacheredis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheRedisApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        User u1 = userService.getUserById(1);
//        userService.deleteUserById(1);
        User user = new User();
        user.setId(1);
        user.setUsername("javaboy");
        user.setAddress("shenzhen");
        userService.updateUserById(user);
        User u2 = userService.getUserById(1);

        System.out.println(u1);
        System.out.println(u2);
    }

}
