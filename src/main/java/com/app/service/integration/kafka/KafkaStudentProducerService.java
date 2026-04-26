package com.app.service.integration.kafka;

import antoniogiovanni.marchese.dto.events.StudentEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaStudentProducerService {

    private final KafkaTemplate<String, StudentEvent> studentKafkaTemplate;

    private static final String TOPIC = "student-events";

    public KafkaStudentProducerService(KafkaTemplate<String, StudentEvent> studentKafkaTemplate) {
        this.studentKafkaTemplate = studentKafkaTemplate;
    }

    public void sendStudentCreated(Long id, String name) {

        StudentEvent event = new StudentEvent(
                "STUDENT_CREATED",
                id,
                name
        );

        studentKafkaTemplate.send(TOPIC, id.toString(), event);
    }
}
