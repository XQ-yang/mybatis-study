package com.mybatis.model;

import lombok.Data;

import java.util.Date;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/6 0006
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;

}
