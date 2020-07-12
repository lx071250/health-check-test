package com.personal.program.healthchecktest.controller;

import com.personal.program.healthchecktest.dao.StudentMapper;
import com.personal.program.healthchecktest.dao.TaskMapper;
import com.personal.program.healthchecktest.entity.Student;
import com.personal.program.healthchecktest.entity.Task;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.GregorianCalendar;
import java.util.List;

@RestController
public class TaskController {

    private TaskMapper taskMapper;

    public TaskController(TaskMapper taskMapper){

        this.taskMapper=taskMapper;
    }

    @GetMapping("/all-task")
    public List<Task> getAll(){
        return taskMapper.findAll();
    }
   /* @GetMapping("/update-task"/)
    private List<Task> update() {
        Task task = new Task();
        task.setContent("预防新冠状疫情，请保护好自己，尽量减少出门，做到勤洗手，勤通风，讲卫生，打喷嚏要捂鼻");
        task.setStart(new GregorianCalendar(2020, 3, 1).getTime());
        task.setEnd(new GregorianCalendar(2020, 3, 21).getTime());
        task.setCurrent(new GregorianCalendar(2020, 3, 10).getTime());
        task.setHealth(false);
        task.setSign(false);

        taskMapper.insert(task);

        return taskMapper.findAll();

    }*/


   @RequestMapping("/create-task/")
    public void createTask(@RequestBody Task task){

       taskMapper.insert(task);
   }

/*
    public @ResponseBody
    List<Task> myAction(
            @RequestParam(value = "page", required = false) int page,
            Task task)*/
}

