package org.javaboy.test;

import org.springframework.stereotype.Service;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-07 10:26
 */
@Service
public class HelloService {
    public String sayHello(String name) {
        return "hello " + name;
    }
}
