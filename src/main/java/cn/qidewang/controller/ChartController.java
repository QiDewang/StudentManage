package cn.qidewang.controller;

import cn.qidewang.doMain.Result;
import cn.qidewang.doMain.Student;
import cn.qidewang.service.StudentService;
import cn.qidewang.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.*;

@RestController
@RequestMapping("/chart")
public class ChartController {


    @Autowired
    StudentService studentService;

    @RequestMapping("/ageChart")
    public Result ageChart(){
        //得到所有的学生
        Map studentMap = studentService.getAllStudent(new HashMap());
        //得到全部学生
        List<Student> studentList = (List<Student>) studentMap.get("data");

        //20以下
        Integer age1 = 20;
        Integer countAge1 = 0;
        //20-30
        Integer age2 = 30;
        Integer countAge2 = 0;
        //30-40
        Integer age3 = 40;
        Integer countAge3 = 0;
        //大于40
        Integer countAge4 = 0;
        //(0,20],(20,30]
        for(Student stu: studentList){
            Integer stuage = stu.getAge();
            if(stuage <= age1){
                countAge1++;
            }else if(stuage <= age2){
                countAge2++;
            }else if(stuage <=age3){
                countAge3++;
            }else{
                countAge4++;
            }
        }
        Map resultMap = new HashMap();
        List arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(new Integer[]{age1,age2,age3}));
        resultMap.put("sortList",arrayList);
        resultMap.put("contList",Arrays.asList(new Integer[]{countAge1,countAge2,countAge3,countAge4}));
        return ResultUtil.success(resultMap);
    }
}
