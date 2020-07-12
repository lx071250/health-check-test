package com.personal.program.healthchecktest.entity;

import java.util.List;

public class Student {

    private int studentId;
    private String profile;
    private String name;
    private String className;
    private Boolean status;
    private String detail;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    private List<Task> tasks;

    public Student(){

    }

    public Student(int studentId, String name,String className, Boolean status,String detail,String profile){

        this.className=className;
        this.detail=detail;
        this.studentId=studentId;
        this.name=name;
        this.profile=profile;
        this.status=status;
    }

    public int getStudentId(){

        return studentId;
    }

    public void setStudentId(int studentId){

        this.studentId=studentId;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name=name;
    }

    public String getClassName(){

        return className;
    }

    public void setClassName(String className){

        this.className=className;

    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){

        this.status=status;
    }

    public String getDetail(){

        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getProfile(){

        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
