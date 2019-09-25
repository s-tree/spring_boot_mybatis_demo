package com.jj.spb.spring_boot_mybatis.controller;

import com.jj.spb.spring_boot_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/StudentService")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/test")
    public String findStudent(){
//        return studentService.find(1).getName();
        return "success";
    }
}
