package org.javaboy.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 17:08
 */
@Service
public class HelloService {

    @Scheduled(fixedDelay = 2000)//前面任务的结束时间和后面任务的开始时间之间间隔2s
    public void  fixedDelay() {
//        System.out.println("fixedDelay>>"+new Date());
    }

    @Scheduled(fixedRate = 2000)//两次定时任务开始的间隔时间为2s
    public void fixedRate() {
//        System.out.println("fixedRate>>"+new Date());
    }

    @Scheduled(cron = "0/5 17 * * * ?")
    public void cron() {
        System.out.println("cron>>"+new Date());
    }
}
