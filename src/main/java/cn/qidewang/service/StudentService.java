package cn.qidewang.service;

import cn.qidewang.dao.StudentDao;
import cn.qidewang.doMain.Result;
import cn.qidewang.doMain.Student;
import cn.qidewang.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Result addStudent(Student student) {
        Integer integer = studentDao.addStudent(student);
        if( integer != null){
            return  ResultUtil.success(integer);
        }else{
            return ResultUtil.error(1);
        }
    }
}
