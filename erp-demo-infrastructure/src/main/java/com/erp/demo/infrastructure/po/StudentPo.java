package com.erp.demo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class StudentPo {
  @TableId(type = IdType.AUTO)
  private Long id;
  private String code;
  private String name;
}
