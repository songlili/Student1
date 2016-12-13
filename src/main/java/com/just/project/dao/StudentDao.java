package com.just.project.dao;

import com.just.project.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentDao extends AbstractDao{

    static String tablename;

    static{
        tablename="t_student";
    }

    public List<Student> list(final String where){
        return (List<Student >) super.list(tablename,where);
    }

    public Long getCount(final String where){
        return super.getCount(tablename,where);
    }

    public Student getObject(final String where){
        return (Student) super.getObject(tablename,where);
    }

}

