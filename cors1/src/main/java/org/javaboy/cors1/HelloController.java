package org.javaboy.cors1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-24 16:17
 */
@RestController
//@CrossOrigin(origins = "http://localhost:8081")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello cors!";
    }
    @PutMapping("/doput")
    public String doPut() {
        return "doput";
    }
}
