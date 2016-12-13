package com.just.project.service;

import com.just.project.dao.*;
import com.just.project.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SubjectService extends AbstractService<Subject> {


    public SubjectDao getSubjectDao() {
        return subjectDao;
    }

    public void setSubjectDao(SubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }

    @Resource

    private SubjectDao subjectDao;


    @Override
    public Long getCount() {
        return subjectDao.getCount("");
    }

    @Override
    public List<Subject> list() {
        return subjectDao.list("");
    }



    public Subject getObjectByName(String name){
        return subjectDao.getObject("name = '"+name+"'");
    }

    public Subject getObjectById(Integer id){
        return subjectDao.getObject("id="+id);
    }

    @Override
    public Integer save(Subject subject) {
        return (Integer) subjectDao.save(subject);
    }

    @Override
    public void update(Subject subject) {
        subjectDao.update(subject);
    }
    @Override
    public void delete(Subject subject){
        subjectDao.delete(subject);
    };

}
