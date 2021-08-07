import com.mybatis.mapper.BlogMapper;
import com.mybatis.model.Blog;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/6 0006
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/


public class Test {


    /*
     * 一级缓存：
     * 只在sqlsession会话存在时有效
     * 当数据进行update、insert、delete时缓存失效
     * */
    @org.junit.Test
    public void query(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog1 = mapper.queryBlogByID("50c3a11449c748888e7f1bf034af9dce");

        System.out.println(blog1);

        Blog blog2 = mapper.queryBlogByID("50c3a11449c748888e7f1bf034af9dce");

        System.out.println(blog2);

        System.out.println(blog1==blog2);

        sqlSession.close();
    }



    /*
    * 二级缓存：
    * 开启二级缓存后，一个会话结束后，一级缓存就没了，一级缓存中的数据会保存到二级缓存中
    * 新的会话查询信息，先从二级缓存中查找，若没有，再连接数据库查询
    * */
    @org.junit.Test
    public void query1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        SqlSession sqlSession2 = MybatisUtil.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        BlogMapper mapper2 = sqlSession2.getMapper(BlogMapper.class);

        Blog blog = mapper.queryBlogByID("50c3a11449c748888e7f1bf034af9dce");
        System.out.println(blog);
        sqlSession.close();

        Blog blog2 = mapper2.queryBlogByID("93f071077df44246ac88c20adc2fa654");
        System.out.println(blog2);

        System.out.println(blog == blog2);


        sqlSession2.close();
    }


}
