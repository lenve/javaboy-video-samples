package org.javaboy.devtools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-05 7:06
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String  hello() {
        return "hello devtools!";
    }
}
