package com.just.project.dao;

import com.just.project.entity.Student;
import com.just.project.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TeacherDao extends AbstractDao{

    static String tablename;

    static{
        tablename="t_teacher";
    }

    public List<Teacher> list(final String where){
        return (List<Teacher>) super.list(tablename,where);
    }

    public Long getCount(final String where){
        return super.getCount(tablename,where);
    }

    public Teacher getObject(final String where){
        return (Teacher) super.getObject(tablename,where);
    }

}

