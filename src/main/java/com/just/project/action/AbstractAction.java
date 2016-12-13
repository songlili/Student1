package com.just.project.action;

import com.just.project.service.AbstractService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Map;


@Controller
public class AbstractAction<T> extends ActionSupport implements SessionAware,RequestAware{

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Map<String, Object> request;

    public Map<String, Object> getRequest() {
        return request;
    }

    @Override
    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    private Map<String, Object> session;

    protected String list(AbstractService<T> query){
        ArrayList<T> ArrayList = null;
        ArrayList = (java.util.ArrayList<T>) query.list();
        getSession().put("arraylist", ArrayList);

        return SUCCESS;
    }

    protected boolean profile(AbstractService<T> query){
        String key="t";
        if(id!=null){
            getSession().put(key,query.getObjectById(id));
            return false;
        }else{
            return true;
        }
    }

    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    Integer id;

}
