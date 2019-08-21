package org.javaboy.rabbitmq;

import org.javaboy.rabbitmq.config.RabbitFanoutConfig;
import org.javaboy.rabbitmq.config.RabbitHeaderConfig;
import org.javaboy.rabbitmq.config.RabbitTopicConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    public void contextLoads() {
        rabbitTemplate.convertAndSend("hello.javaboy", "hello javaboy!hahaha");
    }

    @Test
    public void test1() {
        rabbitTemplate.convertAndSend(RabbitFanoutConfig.FANOUTNAME,null,"hello fanout!");
    }

    @Test
    public void test2() {
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME, "xiaomi.news", "小米新闻");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME, "vivo.phone", "vivo 手机");
        rabbitTemplate.convertAndSend(RabbitTopicConfig.TOPICNAME, "huawei.phone", "华为手机");
    }

    @Test
    public void test3() {
        Message nameMsg = MessageBuilder.withBody("hello javaboy !".getBytes()).setHeader("name","江南一点雨").build();
        Message ageMsg = MessageBuilder.withBody("hello 99 !".getBytes()).setHeader("age","99").build();
        rabbitTemplate.send(RabbitHeaderConfig.HEADERNAME, null, ageMsg);
        rabbitTemplate.send(RabbitHeaderConfig.HEADERNAME, null, nameMsg);
    }
}
