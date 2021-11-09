import com.mybatis.dao.RoleDao;
import com.mybatis.dao.UserDao;
import com.mybatis.pojo.Role;
import com.mybatis.pojo.User;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author: 小强
 * @date: 2021/8/30 0030
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User user = mapper.findById(2);

        System.out.println(user);


        sqlSession.close();
    }


    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        RoleDao mapper = sqlSession.getMapper(RoleDao.class);

        Role role = mapper.findById(2);

        System.out.println(role);


        sqlSession.close();
    }
}
