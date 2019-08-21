package org.javaboy.cacheredis;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-07 14:57
 */
@Component
public class MyKeyGenerator implements KeyGenerator {
    @Override
    public Object generate(Object o, Method method, Object... objects) {
        return method.getName()+":"+Arrays.toString(objects);
    }
}
