package com.mybatis.mapper;

import com.mybatis.model.Student;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/7 0007
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public interface StudentMapper {
    Student getStudentById(int id);

    Student getStudent(int id);
}
