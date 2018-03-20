package cn.qidewang.dao;

import cn.qidewang.doMain.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentDao {

    void addStudent(Student student);

}
