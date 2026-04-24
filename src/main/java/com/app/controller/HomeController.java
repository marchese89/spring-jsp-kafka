package com.app.controller;

import com.app.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    KafkaProducerService producer;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/test-kafka")
    @ResponseBody
    public String testKafka() {
        producer.send("test-topic", "ciao da spring");
        return "ok";
    }
}