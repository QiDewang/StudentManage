package cn.qidewang.dao;

import cn.qidewang.doMain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    Integer addStudent(Student student);

    /**
    * @author 78692
    * @date 17:05
    * @param
     * *查询所有学生信息
    */
    List getAllStudentLimit(@Param("page") Integer page, @Param("limit") Integer limit);

    List getAllStudent();
    Integer getCount();
}
