package org.javaboy.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-24 17:32
 */
@Component
@Order(98)
public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner2>>>"+Arrays.toString(args));
    }
}
