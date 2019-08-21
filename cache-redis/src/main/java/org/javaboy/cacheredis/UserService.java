package org.javaboy.cacheredis;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-07 14:33
 */
@Service
@CacheConfig(cacheNames = "c1")
public class UserService {

    @Cacheable
    public User getUserById(Integer id) {
        System.out.println("getUserById>>>" + id);
        User user = new User();
        user.setId(id);
        return user;
    }

    @CacheEvict
    public void deleteUserById(Integer id) {
        System.out.println("deleteUserById>>>" + id);
    }

    @CachePut(key = "#user.id")
    public User updateUserById(User user) {
        return user;
    }
}
