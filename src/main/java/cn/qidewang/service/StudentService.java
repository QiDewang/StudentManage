package cn.qidewang.service;

import cn.qidewang.dao.StudentDao;
import cn.qidewang.doMain.Result;
import cn.qidewang.doMain.Student;
import cn.qidewang.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    @Transactional
    public Result addTwoStudent() {
        Student one = new Student();
        one.setAge(2);
        one.setName("oneStudent");
        one.setScore(123);
        one.setSex(1);
        Integer integer = studentDao.addStudent(one);

        Student two = new Student();
        two.setAge(2);
        two.setName("twoStudent");
        two.setScore(123);
        two.setSex(1);
        Integer integer1 = studentDao.addStudent(two);
        Result result = new Result();
        if(integer + integer1 == 2){
            result = ResultUtil.success(2);
        }else{
            result = ResultUtil.error("");
        }
        return  result;
    }

    /**
    * @author 78692
    * @date 17:04
    * @param
     * *查询全部学生信息
    */
    public Map getAllStudent(Integer page,Integer limit) {
        Map resultMap = new HashMap();
        resultMap.put("code",0);
        resultMap.put("count",studentDao.getCount());
        resultMap.put("data",studentDao.getAllStudent((page-1)*limit,limit));
        return resultMap;
    }
}
