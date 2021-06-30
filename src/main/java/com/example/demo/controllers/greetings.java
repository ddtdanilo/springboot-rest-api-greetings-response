package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetings {

  @GetMapping("/greetings")
  public String getResponse(@RequestParam String name) {

    String output = "Hello, " + name + " from devco. GET method";

    return output;
  }

  @PostMapping("/greetings")
  public String postResponse(@RequestParam String name) {

    String output = "Hello, " + name + " from devco. PUT method";

    return output;
  }

  @DeleteMapping("/greetings")
  public String deleteResponse(@RequestParam String name) {

    String output = "Hello, " + name + " from devco. DELETE method";

    return output;
  }

  @PutMapping("/greetings")
  public String putResponse(@RequestParam String name) {

    String output = "Hello, " + name + " from devco. PUT method";

    return output;
  }
}
