package cn.qidewang.service;

import cn.qidewang.dao.StudentDao;
import cn.qidewang.doMain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.addStudent(student);

    }
}
