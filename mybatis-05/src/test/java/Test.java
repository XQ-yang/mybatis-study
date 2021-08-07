import com.mybatis.mapper.BlogMapper;
import com.mybatis.model.Blog;
import com.mybatis.utils.IDUtil;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.*;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/6 0006
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public class Test {
    @org.junit.Test
    public void insertBlog(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();


        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtil.getID());
        blog.setTitle("ssm框架学习");
        blog.setAuthor("小强");
        blog.setCreateTime(new Date());
        blog.setViews(234);


        mapper.insertBlog(blog);

        blog.setId(IDUtil.getID());
        blog.setTitle("springboot原理");
        blog.setAuthor("程程");
        blog.setViews(934);

        mapper.insertBlog(blog);

        blog.setId(IDUtil.getID());
        blog.setTitle("html+css+js搭建网站");
        blog.setAuthor("小强");
        blog.setViews(214);
        mapper.insertBlog(blog);


        blog.setId(IDUtil.getID());
        blog.setTitle("java基础");
        blog.setAuthor("程程");
        blog.setViews(434);
        mapper.insertBlog(blog);

        blog.setId(IDUtil.getID());
        blog.setTitle("javaweb学习");
        blog.setViews(2324);
        mapper.insertBlog(blog);


        sqlSession.commit();
        sqlSession.close();
    }



    @org.junit.Test
    public void queryBlogIF(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        // map.put("title", "ssm框架学习");
        map.put("author","程程");


        List<Blog> blogs = mapper.queryBlogIF(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }



    @org.junit.Test
    public void queryBlogWhen(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        //map.put("title", "ssm框架学习");
        //map.put("author", "程程");
        map.put("views", 434);

        List<Blog> blogs = mapper.queryBlogWhen(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }


        sqlSession.close();
    }


    @org.junit.Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();

        //map.put("title", "ssm框架学习");
        //map.put("author", "程程");
        ArrayList list = new ArrayList();
        ArrayList ids = new ArrayList();

        // list.add(232);
        // list.add(2324);
        // list.add(434);

        ids.add("50c3a11449c748888e7f1bf034af9dce");
        ids.add("93f071077df44246ac88c20adc2fa654");

        map.put("views", list);
        map.put("ids", ids);

        List<Blog> blogs = mapper.queryBlogForeach(map);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }


        sqlSession.close();
    }

}
