package com.app.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic, String event) {

        kafkaTemplate.send(topic, event)
                .addCallback(
                        success -> System.out.println("✔ SEND OK"),
                        error -> System.out.println("❌ SEND FAIL: " + error.getMessage())
                );
    }
}
