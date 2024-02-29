package com.erp.demo.application.service;

import com.erp.demo.application.repository.StudentRepository;
import erp.demo.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentRepository studentRepository;

  public Student queryById(Long id) {
    return studentRepository.queryById(id);
  }

  public void insertOne(Student student) {
    studentRepository.insertOne(student);
  }

  public void update(Student student) {
    studentRepository.update(student);
  }

  public void deleteOne(Long id) {
    studentRepository.delete(id);
  }
}
