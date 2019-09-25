package com.jj.spb.spring_boot_mybatis.mapper;

import com.jj.spb.spring_boot_mybatis.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {

    Student find(int id);
}
