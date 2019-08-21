package org.javaboy.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 11:52
 */
@Component
public class FanoutReceiver {
    @RabbitListener(queues = "queue-one")
    public void handler1(String msg) {
        System.out.println("FanoutReceiver:handler1:" + msg);
    }

    @RabbitListener(queues = "queue-two")
    public void handler2(String msg) {
        System.out.println("FanoutReceiver:handler2:" + msg);
    }
}
