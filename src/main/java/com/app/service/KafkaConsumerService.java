package com.app.service;

import antoniogiovanni.marchese.dto.events.StudentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(
            topics = "test-topic",
            groupId = "my-group",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void consuma(String messaggio) {
        System.out.println("Ricevuto: " + messaggio);
    }
    @KafkaListener(
        topics = "student-events",
        groupId = "my-group",
        containerFactory = "studentKafkaListenerContainerFactory"
    )
    public void consumaStudent(StudentEvent event) {
        System.out.println("Studente ricevuto: " + event.getName());
    }
}
