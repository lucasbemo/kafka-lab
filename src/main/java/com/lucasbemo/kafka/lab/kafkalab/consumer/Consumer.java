package com.lucasbemo.kafka.lab.kafkalab.consumer;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

import avro.User;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }


    @KafkaListener(topics = "user.avro1")
    public void receive(ConsumerRecord<String, User> cr, @Payload User user) {
        LOGGER.info("received user='{}'", user.toString());
        LOGGER.info("received user='{}'", cr.value().toString());
        latch.countDown();
    }
}
