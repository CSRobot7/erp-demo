package com.erp.demo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class StudentPo {
  private Long id;
  private String code;
  private String name;
}
