package com.mybatis.service.impl;

import com.mybatis.dao.UserDao;
import com.mybatis.pojo.User;
import com.mybatis.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 小强
 * @date: 2021/8/30 0030
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }
}
