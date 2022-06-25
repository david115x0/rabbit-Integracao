package com.dh.catalago.rabbit.config;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQSenderConig {

    @Value("${queue.catalago.name}")
    private String catalagoQueue;

    @Bean
    public Queue queue() {
        return new Queue(this.catalagoQueue, false);
    }
}
