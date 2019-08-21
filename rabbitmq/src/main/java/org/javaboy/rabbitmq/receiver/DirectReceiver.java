package org.javaboy.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 11:23
 */
@Component
public class DirectReceiver {
    @RabbitListener(queues = "hello.javaboy")
    public void handler1(String msg) {
        System.out.println("handler1>>>"+msg);
    }
}
