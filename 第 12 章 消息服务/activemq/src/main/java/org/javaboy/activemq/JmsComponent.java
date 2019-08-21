package org.javaboy.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 10:29
 */
@Component
public class JmsComponent {
    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    Queue queue;

    public void send(Message message) {
        jmsMessagingTemplate.convertAndSend(this.queue, message);
    }

    @JmsListener(destination = "hello.javaboy")
    public void receive(Message msg) {
        System.out.println(msg);
    }
}
