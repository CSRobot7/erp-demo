# 技术栈
Java 21  
Spring-boot 3.2.0  
Mybatis-plus 3.5.5  
druid 1.2.5  
SqlServer  
maven 3.9.6  
logback

# 开发工具
IDEA 2023  
下载地址：https://www.jetbrains.com.cn/idea/
工具：见工具目录

# 启动流程
1、修改application.yml文件中sqlserver链接和账密  
2、启动Application main方法即可

# 建表语句
```sql
-- auto-generated definition
create table student
(
    id   bigint identity
        constraint student_pk
        primary key nonclustered,
    code varchar(20),
    name varchar(20)
)
    go


```