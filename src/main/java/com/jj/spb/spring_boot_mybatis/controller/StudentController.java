package com.jj.spb.spring_boot_mybatis.controller;

import com.jj.spb.spring_boot_mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("StudentService")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(name = "/test")
    public String findStudent(@RequestParam int id){
        return studentService.find(id).getName();
    }
}
