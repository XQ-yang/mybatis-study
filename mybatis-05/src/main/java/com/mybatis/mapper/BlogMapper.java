package com.mybatis.mapper;

import com.mybatis.model.Blog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/6 0006
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public interface BlogMapper {
    int insertBlog(Blog blog);

    List<Blog> queryBlogIF(Map map);


    List<Blog> queryBlogWhen(Map map);

    List<Blog> queryBlogForeach(Map map);

}
