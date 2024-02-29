package com.erp.demo.api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/erp/demo")
@RestController
public class HealthController {

  @GetMapping("/health")
  public String health() {
    return "hello world";
  }

}
