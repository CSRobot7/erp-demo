package com.erp.demo.api.convert;

import com.erp.demo.api.dto.StudentDTO;
import erp.demo.domain.Student;
import erp.demo.domain.User;

public class StudentConverter {
  public static StudentDTO convert(Student student) {
    return StudentDTO.builder().id(student.getId()).code(student.getCode()).name(student.getName()).build();
  }

  public static Student convert(StudentDTO student) {
    return Student.builder().id(student.getId()).code(student.getCode()).name(student.getName()).build();
  }
}
