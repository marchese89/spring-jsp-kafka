package com.app.controller;

import com.app.entity.Student;
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
    private StudentService service;

    @GetMapping("/students")
    public String list(Model model) {
        model.addAttribute("students", service.getAll());
        return "students";
    }

    @PostMapping("/students/add")
    public String add(@RequestParam String name) {
        service.add(new Student(name));
        return "redirect:/students";
    }
}