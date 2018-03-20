package cn.qidewang.controller;

import cn.qidewang.doMain.Result;
import cn.qidewang.doMain.Student;
import cn.qidewang.service.StudentService;
import cn.qidewang.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class SutedentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("add")
    public Result addStudent(){
        return ResultUtil.success("1","abc");
    }
}
