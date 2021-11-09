package com.mybatis.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author: 小强
 * @date: 2021/8/30 0030
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class Role implements Serializable {
    private Integer id;
    private String name;

    private List<User> userList;


    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userList=" + userList +
                '}';
    }
}
