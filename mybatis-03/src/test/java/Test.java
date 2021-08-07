import com.mybatis.mapper.TeacherMapper;
import com.mybatis.model.Student;
import com.mybatis.model.Teacher;
import com.mybatis.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/6 0006
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/

/*
* 一对多的处理
*/
public class Test {
    @org.junit.Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher(2);

        System.out.println(teacher);

        sqlSession.close();
    }
}
