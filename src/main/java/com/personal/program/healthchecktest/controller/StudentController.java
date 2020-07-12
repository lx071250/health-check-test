package com.personal.program.healthchecktest.controller;

import com.personal.program.healthchecktest.dao.StudentMapper;
import com.personal.program.healthchecktest.entity.Student;
import com.personal.program.healthchecktest.entity.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentMapper studentMapper;

    public StudentController(StudentMapper studentMapper){

        this.studentMapper=studentMapper;
    }

    @GetMapping("/all")
    public List<Student> getAll(){
        return studentMapper.findAll();
    }
    @GetMapping("/findByTeacher/teacherId/{teacherId}")
   public List<Student> findStudents(@PathVariable final int teacherId){
       return studentMapper.findStudentsByTeacher(teacherId);
    }
     @GetMapping("/setHealth/studentId/{studentId}/status/{status}")
    public  void setStudentHealth(@PathVariable final int studentId,@PathVariable final boolean status){

        studentMapper.setStatus(studentId,status);

     }
   /* @GetMapping("/update")
    private List<Student> update(){
        Student student=new Student();
        student.setName("王五");
        student.setClassName("三年级六班");

        student.setStatus(true);

        studentMapper.insert(student);

        return studentMapper.findAll();


    }*/
}
