package com.infy.eon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DemoKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(DemoKafkaConsumer.class);
    private static final String TOPIC = "topic_demo";

    @KafkaListener(topics = "topic_demo", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
