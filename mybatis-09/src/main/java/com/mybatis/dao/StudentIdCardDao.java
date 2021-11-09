package com.mybatis.dao;

import com.mybatis.pojo.StudentIdCard;

/**
 * @author: 小强
 * @date: 2021/11/9 0009
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public interface StudentIdCardDao {
    StudentIdCard findStudentIdCardById(int id);
}
