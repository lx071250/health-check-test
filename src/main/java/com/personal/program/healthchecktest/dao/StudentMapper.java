package com.personal.program.healthchecktest.dao;

import com.personal.program.healthchecktest.entity.Student;
import com.personal.program.healthchecktest.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM students")
    public List<Student> findAll();

    @Select("select teacherId,name FROM teacher WHERE teacherId=#{teacherId}")
      @Results(value={
              @Result(property="teacherId",column="teacherId"),
              @Result(property = "name",column="name"),
              @Result(property = "className",column="className"),
              @Result(property = "students",column = "teacherId",javaType = List.class,many=@Many(select="selectStudents"))
      })
    public Teacher findById(int teacherId);
    @Select("SELECT *FROM students WHERE teacherId=#{teacherId}")
            @Results(value={
                    @Result(property="studentId",column="studentId"),
                    @Result(property = "name",column = "name"),
                    @Result(property = "className",column = "className"),
                    @Result(property = "detail",column = "detail"),
                    @Result(property = "status",column = "status"),
                    @Result(property = "profile",column = "profile"),
                  //  @Result(property="teacherId",column="teacherId"),
                   // @Result(property="taskId",column="taskId")

            })

   public List<Student> findStudentsByTeacher(int teacherId);

    @Update("Update students set status=#{status} WHERE studentId=#{studentId}")
    public void setStatus(int studentId,boolean status);

   // @Select("SELECT * FROM student WHERE id = #{id}")
    //public List<Student> findById(int id);

   // @Select("SELECT * FROM student Where name = #{name}")
    //public List<Student> findByName(String name);

   // @Insert("INSERT INTO students(name,className,profile,status,detail) VALUES(#{name},#{className},#{profile},#{status},#{detail})")
    //public int insert(Student student);

   // @Update("Update student set name=#{name},className=#{className},status=#{status},detail=#{detail} where id=#{id}")
    //public int update(Student student);
}
