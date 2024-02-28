package com.erp.demo.infrastructure.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.erp.demo.infrastructure.mapper.StudentMapper;
import com.erp.demo.infrastructure.po.StudentPo;
import erp.demo.domain.Student;
import erp.demo.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {
  private final StudentMapper studentMapper;


  @Override
  public Student queryById(Long id) {
    LambdaQueryWrapper<StudentPo> wrapper = new LambdaQueryWrapper<>();
    wrapper.eq(StudentPo::getId, id);
    final StudentPo studentPo = studentMapper.selectOne(wrapper);
    return convert(studentPo);
  }

  private Student convert(StudentPo studentPo) {
    return Student.builder().id(studentPo.getId()).code(studentPo.getCode()).name(studentPo.getName()).build();
  }
}
