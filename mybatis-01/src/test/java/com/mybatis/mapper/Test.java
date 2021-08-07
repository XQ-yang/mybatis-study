package com.mybatis.mapper;

import com.mybatis.model.User;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/5/25 0025
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/


/*
* mybatis入门，整合log4j日志
* */
public class Test {
    @org.junit.Test
    public void queryAll(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.queryAll();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
        
    }


    @org.junit.Test
    public void queryById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryById(1);

        System.out.println(user);


        sqlSession.close();
    }


    @org.junit.Test
    public void updateById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateById(new User(2,"yang","2930"));

        sqlSession.commit();

        sqlSession.close();
    }


    @org.junit.Test
    public void insertUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.insertUser(new User(5, "yangdka", "34324"));



        sqlSession.commit();
        sqlSession.close();
    }

    @org.junit.Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(5);

        sqlSession.commit();
        sqlSession.close();
    }


    /*
    * 分页
    * */
    @org.junit.Test
    public void queryLimit(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.queryLimit(1, 2);

        for (User user : users) {
            System.out.println(user);
        }


        sqlSession.close();
    }

}
