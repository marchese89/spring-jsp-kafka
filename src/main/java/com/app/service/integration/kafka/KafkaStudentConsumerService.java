package com.app.service.integration.kafka;

import antoniogiovanni.marchese.dto.events.StudentEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaStudentConsumerService {

    @KafkaListener(
        topics = "student-events",
        groupId = "my-group",
        containerFactory = "studentKafkaListenerContainerFactory"
    )
    public void consumaStudent(StudentEvent event) {
        System.out.println("Studente ricevuto: " + event.getName());
    }
}
