package com.jj.spb.spring_boot_mybatis.controller;

import com.jj.spb.spring_boot_mybatis.factory.ResultFactory;
import com.jj.spb.spring_boot_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/StudentService")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/test")
    public String findStudent(){
        System.out.println("called findStudent");
        return studentService.find("1").getName();
    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(@RequestParam(name = "name",required = true) String name,
                             @RequestParam(name = "age",required = false,defaultValue = "0") int age,
                             @RequestParam(name = "sex",required = true) String sex,
                             @RequestParam(name = "studyNum",required = true) int studyNum,
                             @RequestParam(name = "height",required = false,defaultValue = "0") int height,
                             @RequestParam(name = "weight",required = false,defaultValue = "0") int weight){
        System.out.println("called addStudent");
        int resultCount = 0;
        if(studentService.queryStudentCountByNum(studyNum) == 0){
            resultCount = studentService.addStudent(name,age,sex,studyNum,height,weight);
        }else{
            resultCount = studentService.updateStudent(name,age,sex,studyNum,height,weight);
        }
        if(resultCount == 1){
            return ResultFactory.buildResultBody(true,null,200,"录入成功");
        }
        return ResultFactory.buildResultBody(false,null,500,"录入失败");
    }

}
