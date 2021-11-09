package com.mybatis.dao;

import com.mybatis.pojo.Banji;

import java.util.List;

/**
 * @author: 小强
 * @date: 2021/11/9 0009
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public interface BanjiDao {
    List<Banji> findBanjiWithStudent();
}
