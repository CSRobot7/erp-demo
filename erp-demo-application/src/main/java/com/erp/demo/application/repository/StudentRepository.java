package com.erp.demo.application.repository;

import erp.demo.domain.Student;

public interface StudentRepository {
  Student queryById(Long id);

  Integer insertOne(Student student);

  Integer update(Student student);

  Integer delete(Long id);
}
