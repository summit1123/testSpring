package com.example.testspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api")
    public String home() {
        return "Hello, Test Spring Boot Application! The server is running successfully.";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return "가고 싶어요 사랑합니다";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy and running!";
    }
}