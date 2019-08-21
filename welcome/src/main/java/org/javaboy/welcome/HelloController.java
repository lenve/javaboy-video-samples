package org.javaboy.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-26 8:00
 */
@Controller
public class HelloController {
    @GetMapping("/index")
    public String hello() {
        return "index";
    }
}
