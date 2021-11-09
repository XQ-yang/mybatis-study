package com.mybatis.dao;

import com.mybatis.pojo.Course;

/**
 * @author: 小强
 * @date: 2021/11/9 0009
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public interface CourseDao {
    Course findCourseWithStudent(int id);
    Course findCourseWithStudent2(int id);
}
