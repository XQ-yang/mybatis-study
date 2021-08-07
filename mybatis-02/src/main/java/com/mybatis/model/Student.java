package com.mybatis.model;

import lombok.Data;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/5 0005
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
@Data
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
