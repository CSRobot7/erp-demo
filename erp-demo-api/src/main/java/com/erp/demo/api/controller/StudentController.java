package com.erp.demo.api.controller;


import com.erp.demo.api.convert.StudentConverter;
import com.erp.demo.api.dto.StudentDTO;
import com.erp.demo.application.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@RequestMapping("/student")
@Controller
public class StudentController {
  @Resource
  private StudentService studentService;

  @GetMapping("/query")
  public StudentDTO queryUserById(@RequestParam("id") Long id) {
    return StudentConverter.convert(studentService.queryById(id));
  }
}
