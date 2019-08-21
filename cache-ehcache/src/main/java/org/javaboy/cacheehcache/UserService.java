package org.javaboy.cacheehcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-07 16:56
 */
@Service
public class UserService {
    @Cacheable(cacheNames = "mycache")
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        System.out.println("getUserById>>>"+id);
        return user;
    }
}
