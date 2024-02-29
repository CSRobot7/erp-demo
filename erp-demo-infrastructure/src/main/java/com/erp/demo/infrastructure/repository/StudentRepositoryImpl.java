package com.erp.demo.infrastructure.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.erp.demo.application.repository.StudentRepository;
import com.erp.demo.infrastructure.mapper.StudentMapper;
import com.erp.demo.infrastructure.po.StudentPo;
import erp.demo.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {
  private final StudentMapper studentMapper;


  @Override
  public Student queryById(Long id) {
    LambdaQueryWrapper<StudentPo> wrapper = Wrappers.lambdaQuery();
    wrapper.eq(StudentPo::getId, id);
    final StudentPo studentPo = studentMapper.selectOne(wrapper);
    return convert(studentPo);
  }

  @Override
  public Integer insertOne(Student student) {
    return studentMapper.insert(convert(student));
  }

  @Override
  public Integer update(Student student) {
    LambdaUpdateWrapper<StudentPo> updateWrapper = Wrappers.lambdaUpdate();
    updateWrapper
        .eq(StudentPo::getId, student.getId());
    return studentMapper.update(convert(student), updateWrapper);
  }

  @Override
  public Integer delete(Long id) {
    LambdaQueryWrapper<StudentPo> query = Wrappers.lambdaQuery();
    query.eq(StudentPo::getId, id);
    return studentMapper.delete(query);
  }

  private Student convert(StudentPo studentPo) {
    return Student.builder().id(studentPo.getId()).code(studentPo.getCode()).name(studentPo.getName()).build();
  }

  private StudentPo convert(Student student) {
    StudentPo studentPo = new StudentPo();
    studentPo.setCode(student.getCode());
    studentPo.setName(student.getName());
    return studentPo;
  }
}
