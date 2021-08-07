import com.mybatis.mapper.StudentMapper;
import com.mybatis.model.Student;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/5 0005
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/

/*
* 多对一的处理
* */
public class Test {
    @org.junit.Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> student = mapper.getStudent();

        for (Student student1 : student) {
            System.out.println(student1);
        }

        sqlSession.close();
    }
}
