package org.javaboy.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 12:09
 */
@Configuration
public class RabbitTopicConfig {
    public static final String TOPICNAME = "javaboy-topic";

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange(TOPICNAME, true, false);
    }

    @Bean
    Queue xiaomi() {
        return new Queue("xiaomi");
    }

    @Bean
    Queue huawei() {
        return new Queue("huawei");
    }

    @Bean
    Queue phone() {
        return new Queue("phone");
    }

    @Bean
    Binding xiaomiBinding() {
        return BindingBuilder.bind(xiaomi()).to(topicExchange()).with("xiaomi.#");
    }

    @Bean
    Binding huaweiBinding() {
        return BindingBuilder.bind(huawei()).to(topicExchange()).with("huawei.#");
    }
    @Bean
    Binding phoneBinding() {
        return BindingBuilder.bind(phone()).to(topicExchange()).with("#.phone.#");
    }
}
