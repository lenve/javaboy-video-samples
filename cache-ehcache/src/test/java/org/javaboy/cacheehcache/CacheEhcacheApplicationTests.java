package org.javaboy.cacheehcache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheEhcacheApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
        User u1 = userService.getUserById(1);
        User u2 = userService.getUserById(1);
        System.out.println(u1);
        System.out.println(u2);
    }

}
