package com.mybatis.dao;

import com.mybatis.pojo.User;

/**
 * @author: 小强
 * @date: 2021/8/30 0030
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */

public interface UserDao {
    User findById(int id);
}
