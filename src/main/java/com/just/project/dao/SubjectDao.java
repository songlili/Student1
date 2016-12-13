package com.just.project.dao;

import com.just.project.entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SubjectDao extends AbstractDao{

    static String tablename;

    static{
        tablename="t_subject";
    }

    public List<Subject> list(final String where){
        return (List<Subject>) super.list(tablename,where);
    }

    public Long getCount(final String where){
        return super.getCount(tablename,where);
    }

    public Subject getObject(final String where){
        return (Subject) super.getObject(tablename,where);
    }

}

