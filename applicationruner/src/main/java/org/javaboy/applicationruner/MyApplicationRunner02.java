package org.javaboy.applicationruner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-24 17:41
 */
@Component
@Order(98)
public class MyApplicationRunner02 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String[] sourceArgs = args.getSourceArgs();//获取启动的所有参数
        System.out.println("sourceArgs:" + Arrays.toString(sourceArgs));
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("nonOptionArgs:" + nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        for (String optionName : optionNames) {
            System.out.println(optionName + ":" + args.getOptionValues(optionName));
        }
        System.out.println(">>>>>>>>>>>>>>>MyApplicationRunner02结束>>>>>>>>>>>>>>>>");
    }
}
