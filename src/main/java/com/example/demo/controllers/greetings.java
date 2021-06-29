package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetings {

    @GetMapping("/greetings")
    public String getResponse(@RequestParam String name) {

        String output = "Hello, " + name + " from devco. GET method";

        return output;

    }
}
