package com.just.project.dao;

import com.just.project.entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class QsasDao extends AbstractDao{

    static String tablename;

    static{
        tablename="t_qsas";
    }

    public List<Qsas> list(final String where){
        return (List<Qsas >) super.list(tablename,where);
    }

    public Long getCount(final String where){
        return super.getCount(tablename,where);
    }

    public Qsas getObject(final String where){
        return (Qsas) super.getObject(tablename,where);
    }

}

