package com.app.controller;

import com.app.model.Student;
import com.app.service.integration.kafka.KafkaStudentProducerService;
import com.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private KafkaStudentProducerService producer;

    @GetMapping("/students")
    public String list(Model model) {
        model.addAttribute("students", studentService.getAll());
        return "students";
    }

    @PostMapping("/students/add")
    public String addStudent(@RequestParam String name) {
        Student s = new Student();
        s.setName(name);

        Student saved = studentService.add(s);

        producer.sendStudentCreated(
                saved.getId(),
                saved.getName()
        );

        return "redirect:/students";
    }
}
