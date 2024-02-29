package com.erp.demo.api.controller;


import com.erp.demo.api.convert.StudentConverter;
import com.erp.demo.api.dto.StudentDTO;
import com.erp.demo.application.service.StudentService;
import com.erp.demo.infrastructure.po.StudentPo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/erp/demo/student")
@RestController
public class StudentController {
  @Resource
  private StudentService studentService;

  @GetMapping("/query")
  public StudentDTO queryUserById(@RequestParam("id") Long id) {
    return StudentConverter.convert(studentService.queryById(id));
  }

  @PostMapping("/insert/one")
  public String insertOne(@RequestBody StudentDTO studentDTO) {
    studentService.insertOne(StudentConverter.convert(studentDTO));
    return "success";
  }

  @PutMapping("/update/one")
  public String updateOne(@RequestBody StudentDTO studentDTO) {
    studentService.update(StudentConverter.convert(studentDTO));
    return "success";
  }

  @DeleteMapping("/delete/one")
  public String deleteOne(@RequestParam Long id) {
    studentService.deleteOne(id);
    return "success";
  }
}
