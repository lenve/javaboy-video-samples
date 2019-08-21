package org.javaboy.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 11:19
 */
@Configuration
public class RabbitDirectConfig {
    public final static String DIRECTNAME = "javaboy-direct";

    @Bean
    Queue queue() {
        return new Queue("hello.javaboy");
    }
    @Bean
    DirectExchange directExchange() {
        return new DirectExchange(DIRECTNAME, true, false);
    }

    @Bean
    Binding binding() {
        return BindingBuilder.bind(queue()).to(directExchange()).with("direct");
    }
}
