package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Welcome to Spring Boot on OpenShift!");
        response.put("timestamp", LocalDateTime.now().toString());
        response.put("status", "running");
        return response;
    }

    @GetMapping("/hello")
    public Map<String, String> hello(@RequestParam(defaultValue = "World") String name) {
        Map<String, String> response = new HashMap<>();
        response.put("greeting", "Hello, " + name + "!");
        response.put("timestamp", LocalDateTime.now().toString());
        return response;

    }

    @GetMapping("/health")
    public Map<String, String> health(@RequestParam(defaultValue = "World") String name) {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("application", "spring-boot-demo");
        return response;

    }
    
}
