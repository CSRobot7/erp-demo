package com.erp.demo.api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/erp/demo")
@Controller
public class HealthController {

  @GetMapping("/health")
  public String health() {
    return "hello world";
  }

}
