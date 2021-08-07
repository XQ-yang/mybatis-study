package com.mybatis.mapper;

import com.mybatis.model.Course;

import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/6 0006
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public interface CourseMapper {
    Course getCourseById(int cid);

    Course getCourse(int cid);
}
