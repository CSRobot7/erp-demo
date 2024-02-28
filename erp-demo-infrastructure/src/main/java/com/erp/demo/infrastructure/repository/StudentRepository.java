package com.erp.demo.infrastructure.repository;

import erp.demo.domain.Student;
import erp.demo.domain.User;

public interface StudentRepository {
  Student queryById(Long id);

}
