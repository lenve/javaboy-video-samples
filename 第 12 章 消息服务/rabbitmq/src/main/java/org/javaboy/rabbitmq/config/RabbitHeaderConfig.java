package org.javaboy.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 12:21
 */
@Configuration
public class RabbitHeaderConfig {
    public static final String HEADERNAME = "javaboy-header";

    @Bean
    HeadersExchange headersExchange() {
        return new HeadersExchange(HEADERNAME, true, false);
    }

    @Bean
    Queue queueName() {
        return new Queue("name-queue");
    }

    @Bean
    Queue queueAge() {
        return new Queue("age-queue");
    }

    @Bean
    Binding bindingName() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "javaboy");
        return BindingBuilder.bind(queueName()).to(headersExchange()).whereAny(map).match();
    }

    @Bean
    Binding bindingAge() {
        return BindingBuilder.bind(queueAge()).to(headersExchange()).where("age").exists();
    }
}
