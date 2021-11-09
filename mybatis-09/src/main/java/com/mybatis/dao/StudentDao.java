package com.mybatis.dao;

import com.mybatis.pojo.Student;
import com.mybatis.pojo.Student2;

/**
 * @author: 小强
 * @date: 2021/11/9 0009
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public interface StudentDao {
    Student findStudentById(int id);
    Student findStudentById2(int id);

    Student2 findStudentWithCourseById(int id);
}
