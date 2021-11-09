package com.mybatis.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author: 小强
 * @date: 2021/8/30 0030
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private Integer age;

    private List<Role> roleList;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", roleList=" + roleList +
                '}';
    }
}
