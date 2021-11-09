import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.dao.UserDao;
import com.mybatis.pojo.User;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

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

        PageHelper.startPage(3, 5);
        List<User> users = mapper.queryAll();

        for (User user : users) {
            System.out.println(user);
        }

        PageInfo pageInfo = new PageInfo(users);

        sqlSession.close();
    }
}
