package com.mybatis.service;

import com.mybatis.pojo.User;

import java.util.List;

/**
 * @author: 小强
 * @date: 2021/8/30 0030
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public interface UserService {
    List<User> queryAll();
}
