package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello user";
  }
  @GetMapping("/helloAdmin")
  public String helloAdmin() {
    return "Hello admin";
  }
}
