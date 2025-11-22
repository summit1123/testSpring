package com.example.testspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello, Test Spring Boot Application! The server is running successfully.";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return String.format("Hello, %s! Welcome to the test application.", name);
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy and running!";
    }
}