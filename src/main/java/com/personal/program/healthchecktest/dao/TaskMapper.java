package com.personal.program.healthchecktest.dao;

import com.personal.program.healthchecktest.entity.Student;
import com.personal.program.healthchecktest.entity.Task;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TaskMapper {

    @Select("SELECT * FROM tasks")
    public List<Task> findAll();


    // @Select("SELECT * FROM task WHERE taskId = #{taskId}")
    //public List<Task> findById(int taskId);


    @Insert("INSERT INTO tasks(content,detail,end,start,current,health,sign) VALUES(#{content},#{detail},#{end},#{start},#{current},#{health},#{sign})")
    public int insert(Task task);

     @Update("Update task SET start=#{start},end=#{end},current=#{current}, health=#{health},sign=#{sign} where taskId=#{taskId}")
    public int update(Task task);
}
