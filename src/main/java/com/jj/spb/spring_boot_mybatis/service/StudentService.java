package com.jj.spb.spring_boot_mybatis.service;

import com.jj.spb.spring_boot_mybatis.entity.Student;
import com.jj.spb.spring_boot_mybatis.mapper.StudentMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student find(String id){
        return studentMapper.find(id);
    }

    public Integer addStudent(String name,int age,String sex,
                              int studyNum,int height,int weight){
        return studentMapper.addStudent(name,age,sex,studyNum,height,weight);
    }

    public Integer queryStudentCountByNum(int studyNum){
        return studentMapper.queryStudentCountByNum(studyNum);
    }
}
