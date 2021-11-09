import com.mybatis.dao.BanjiDao;
import com.mybatis.dao.CourseDao;
import com.mybatis.dao.StudentDao;
import com.mybatis.pojo.Banji;
import com.mybatis.pojo.Course;
import com.mybatis.pojo.Student;
import com.mybatis.pojo.Student2;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author: 小强
 * @date: 2021/11/9 0009
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class MyTest {
    @Test
    public void findStudentByIdTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();


        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        Student student = mapper.findStudentById2(3);

        System.out.println(student);


    }

    @Test
    public void findBanjiTest() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        BanjiDao mapper = sqlSession.getMapper(BanjiDao.class);

        List<Banji> banjis = mapper.findBanjiWithStudent();

        for (Banji banji : banjis) {
            System.out.println(banji);
        }
    }

    @Test
    public void findCourseByIdTest(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        CourseDao mapper = sqlSession.getMapper(CourseDao.class);

        Course course = mapper.findCourseWithStudent(2);

        System.out.println(course);
    }

    @Test
    public void findCourseByIdTest2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        CourseDao mapper = sqlSession.getMapper(CourseDao.class);

        Course course = mapper.findCourseWithStudent2(2);

        System.out.println(course);
    }

    @Test
    public void findStudentByIdTest2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        Student2 student = mapper.findStudentWithCourseById(1);

        System.out.println(student);
    }
}
