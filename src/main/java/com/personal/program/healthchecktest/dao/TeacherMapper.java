package com.personal.program.healthchecktest.dao;

import com.personal.program.healthchecktest.entity.Student;
import com.personal.program.healthchecktest.entity.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TeacherMapper {

    @Select("SELECT * FROM teachers")
    public List<Teacher> findAll();

    // @Select("SELECT * FROM teacher WHERE id = #{id}")
    //public List<Teacher> findById(int id);

    @Select("SELECT * FROM teachers Where name = #{name}")
    public List<Teacher> findByName(String name);

    @Insert("INSERT INTO teachers(name,className) VALUES(#{name},#{className})")
    public int insert(Teacher teacher);

    // @Update("Update teacher set name=#{name},className=#{className} where id=#{id}")
    //public int update(Teacher teacher);
}
