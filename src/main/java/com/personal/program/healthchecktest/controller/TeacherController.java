package com.personal.program.healthchecktest.controller;

import com.personal.program.healthchecktest.dao.StudentMapper;
import com.personal.program.healthchecktest.dao.TeacherMapper;
import com.personal.program.healthchecktest.entity.Student;
import com.personal.program.healthchecktest.entity.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {

    private TeacherMapper teacherMapper;

    public TeacherController(TeacherMapper teacherMapper){

        this.teacherMapper=teacherMapper;
    }

    @GetMapping("/all-teacher")
    public List<Teacher> getAll(){
        return teacherMapper.findAll();
    }
    @GetMapping("/update-teacher")
    private List<Teacher> update(){
        Teacher teacher=new Teacher();
        teacher.setName("牛老师");
        teacher.setClassName("三年级六班");

        teacherMapper.insert(teacher);

        return teacherMapper.findAll();
    }
}
