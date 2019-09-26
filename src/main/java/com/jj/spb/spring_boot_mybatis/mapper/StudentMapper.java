package com.jj.spb.spring_boot_mybatis.mapper;

import com.jj.spb.spring_boot_mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {

    Student find(@Param("id") String id);

    Integer addStudent(@Param("name") String name,
                       @Param("age") int age,
                       @Param("sex") String sex,
                       @Param("studyNum") int studyNum,
                       @Param("height") int height,
                       @Param("weight") int weight);

    Integer queryStudentCountByNum(@Param("studyNum") int studyNum);
}
