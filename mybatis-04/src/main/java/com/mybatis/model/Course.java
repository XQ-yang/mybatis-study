package com.mybatis.model;

import lombok.Data;

import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/6 0006
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
@Data
public class Course {
    private int cid;
    private String cname;
    private List<Student> students;
}
