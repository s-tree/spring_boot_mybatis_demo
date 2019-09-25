package com.jj.spb.spring_boot_mybatis.service;

import com.jj.spb.spring_boot_mybatis.entity.Student;
import com.jj.spb.spring_boot_mybatis.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student find(int id){
        return studentMapper.find(id);
    }
}
