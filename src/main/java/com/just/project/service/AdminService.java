package com.just.project.service;

import com.just.project.dao.*;
import com.just.project.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class AdminService {


    public AdminDao getAdminDao() {
        return adminDao;
    }

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    @Resource

    private AdminDao adminDao;



    public Admin loginIn(Admin login){
        return adminDao.getObject("name='"+login.getName()+
                "' AND "+"password='"+login.getPassword()+"'");
    }

}
