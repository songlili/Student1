package com.just.project.service;

import com.just.project.entity.Student;
import com.just.project.dao.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentService extends AbstractService<Student> {


    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Resource

    private StudentDao studentDao;


    @Override
    public Long getCount() {
        return studentDao.getCount("");
    }

    @Override
    public List<Student> list() {
        return studentDao.list("");
    }



    public Student getObjectByName(String name){
        return studentDao.getObject("name = '"+name+"'");
    }

    public Student getObjectById(Integer id){
        return studentDao.getObject("id="+id);
    }

    @Override
    public Integer save(Student student) {
        return (Integer) studentDao.save(student);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    public void delete(Student student){
        studentDao.delete(student);
    };
    public Student loginIn(Student login){
        return studentDao.getObject("name='"+login.getName()+
                "' AND "+"password='"+login.getPassword()+"'");
    }
}
