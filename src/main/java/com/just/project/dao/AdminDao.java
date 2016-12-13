package com.just.project.dao;

import com.just.project.entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AdminDao extends AbstractDao{

    static String tablename;

    static{
        tablename="t_admin";
    }



    public Admin getObject(final String where){
        return (Admin) super.getObject(tablename,where);
    }

}
