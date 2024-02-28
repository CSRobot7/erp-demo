package com.erp.demo.application.service;

import com.erp.demo.infrastructure.repository.StudentRepository;
import erp.demo.domain.Student;
import erp.demo.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentRepository studentRepository;

  public Student queryById(Long id) {
    return studentRepository.queryById(id);
  }
}
