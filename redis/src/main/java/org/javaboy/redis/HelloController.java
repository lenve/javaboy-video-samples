package org.javaboy.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-29 7:53
 */
@RestController
public class HelloController {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @GetMapping("/set")
    public void set() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("name", "javaboy");
    }
    @GetMapping("/get")
    public void get() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        System.out.println(ops.get("name"));
    }
}
