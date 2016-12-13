package com.just.project.service;

import com.just.project.dao.*;
import com.just.project.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class QsasService extends AbstractService<Qsas> {


    public QsasDao getQsasDao() {
        return qsasDao;
    }

    public void setQsasDao(QsasDao qsasDao) {
        this.qsasDao = qsasDao;
    }

    @Resource

    private QsasDao qsasDao;


    @Override
    public Long getCount() {
        return qsasDao.getCount("");
    }

    @Override
    public List<Qsas> list() {
        return qsasDao.list("");
    }



    public Qsas getObjectByQuestion(String question ){
        return  qsasDao.getObject("question = '"+question+"'");
    }

    public Qsas getObjectById(Integer id){
        return qsasDao.getObject("id="+id);
    }

    @Override
    public Integer save(Qsas qsas) {
        return (Integer) qsasDao.save(qsas);
    }

    @Override
    public void update(Qsas qsas) {
        qsasDao.update(qsas);
    }

    public void delete(Qsas qsas){
        qsasDao.delete(qsas);
    };

}
