package com.jj.spb.spring_boot_mybatis.mapper;

import com.jj.spb.spring_boot_mybatis.entity.Student;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface StudentMapper {

    Student find(int id);
}
