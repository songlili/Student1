package com.just.project.service;

import com.just.project.dao.*;
import com.just.project.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class TeacherService extends AbstractService<Teacher> {


    public TeacherDao getTeacherDao() {
        return teacherDao;
    }

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Resource

    private TeacherDao teacherDao;


    @Override
    public Long getCount() {
        return teacherDao.getCount("");
    }

    @Override
    public List<Teacher> list() {
        return teacherDao.list("");
    }



    public Teacher getObjectByName(String name){
        return teacherDao.getObject("name = '"+name+"'");
    }

    public Teacher getObjectById(Integer id){
        return teacherDao.getObject("id="+id);
    }

    @Override
    public Integer save(Teacher teacher) {
        return (Integer) teacherDao.save(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        teacherDao.update(teacher);
    }

    public void delete(Teacher teacher){
        teacherDao.delete(teacher);
    };
    public Teacher loginIn(Teacher login){
        return teacherDao.getObject("name='"+login.getName()+
                "' AND "+"password='"+login.getPassword()+"'");
    }
}
