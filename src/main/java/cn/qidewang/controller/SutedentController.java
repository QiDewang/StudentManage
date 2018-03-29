package cn.qidewang.controller;

import cn.qidewang.doMain.Result;
import cn.qidewang.doMain.Student;
import cn.qidewang.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class SutedentController {


    @Autowired
    private StudentService studentService;

    private static final Logger log = LoggerFactory.getLogger(SutedentController.class);

    @RequestMapping(value = {"/add", "/addStudent"}, method = RequestMethod.POST)
    public Result addStudent(Student student){
        return studentService.addStudent(student);
    }

    @RequestMapping(value = "/insertTwo",method = RequestMethod.POST)
    public Result addTwoStudent(){
        return studentService.addTwoStudent();
    }

    @RequestMapping("/getAllStudent")
    public List getAllStudent(){
        return studentService.getAllStudent();
    }
}
