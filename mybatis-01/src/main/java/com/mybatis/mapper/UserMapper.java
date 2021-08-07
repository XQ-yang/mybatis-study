package com.mybatis.mapper;

import com.mybatis.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/5/25 0025
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public interface UserMapper {
    List<User> queryAll();

    User queryById(int id);

    int updateById(User user);

    int insertUser(User user);

    int deleteUser(int id);

    List<User> queryLimit(@Param("offset") int offset, @Param("limit") int limit);
}
