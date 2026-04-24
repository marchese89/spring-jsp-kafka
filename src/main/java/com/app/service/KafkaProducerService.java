package com.app.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic, String messaggio) {
//        kafkaTemplate.send(topic, messaggio);
//        System.out.println("Inviato: " + messaggio);
        kafkaTemplate.send(topic, messaggio)
                .addCallback(
                        success -> System.out.println("✔ SEND OK"),
                        error -> System.out.println("❌ SEND FAIL: " + error.getMessage())
                );

    }
}
