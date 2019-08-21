package org.javaboy.quartz.job;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 17:28
 */
@Component
public class MyFirstJob {
    public void sayHello() {
        System.out.println("first job say hello:" + new Date());
    }
}
