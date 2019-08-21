package org.javaboy.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 12:14
 */
@Component
public class TopicReceiver {
    @RabbitListener(queues = "xiaomi")
    public void handler1(String msg) {
        System.out.println("TopicReceiver:handler1:" + msg);
    }

    @RabbitListener(queues = "huawei")
    public void handler2(String msg) {
        System.out.println("TopicReceiver:handler2:" + msg);
    }

    @RabbitListener(queues = "phone")
    public void handler3(String msg) {
        System.out.println("TopicReceiver:handler3:" + msg);
    }
}
