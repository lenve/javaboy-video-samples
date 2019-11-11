package org.javaboy.controlleradvice;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-24 14:43
 */
@ControllerAdvice
public class GlobalData {
    @ModelAttribute(value = "info")
    public Map<String,Object> mydata() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "javaboy");
        map.put("address", "www.javaboy.org");
        return map;
    }

    @InitBinder("a")
    public void initA(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }
    @InitBinder("b")
    public void initB(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }
}