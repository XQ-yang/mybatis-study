import com.mybatis.mapper.CourseMapper;
import com.mybatis.mapper.StudentMapper;
import com.mybatis.mapper.TeacherMapper;
import com.mybatis.model.Course;
import com.mybatis.model.Student;
import com.mybatis.model.Teacher;
import com.mybatis.utils.MybatisUtil;
import com.sun.media.sound.SoftTuning;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/8/6 0006
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/

/*
* 多对多
*
* */
public class Test {
    @org.junit.Test
    public void getSc(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);

        Course course = mapper.getCourseById(1);
        List<Student> students = course.getStudents();

        System.out.println("有" + students.size() + "个同学选修了" + course.getCname() +",  为:");

        for (Student student : students) {
            System.out.print(student.getName()+"\t");
        }
        System.out.println();


        sqlSession.close();
    }


    @org.junit.Test
    public void getCourse(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);

        Course course = mapper.getCourse(1);

        System.out.println(course);

        sqlSession.close();
    }



    @org.junit.Test
    public void getStudentById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Student student = mapper.getStudentById(2);
        List<Course> courses = student.getCourses();

        System.out.println(student.getName() +"同学选修了" + courses.size()+"门课：");

        for (Course course : courses) {
            System.out.print(course.getCname()+"\t");
        }
        System.out.println();


        sqlSession.close();
    }


    @org.junit.Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher(2);

        System.out.println(teacher);

        sqlSession.close();
    }
}
