package com.just.project.action;

import com.just.project.entity.*;
import com.just.project.service.*;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


@Controller
@Namespace("/qsas")
@ParentPackage("userDefault")
public class QsasAction extends AbstractAction<Qsas> {
   // static Logger logger=Logger.getLogger(DoctorAction.class);

    @Resource
    QsasService qsasService;



    @Action(value = "list",results = {
            @Result(name = "success",type = "redirect",location = "/view/qsas/list.jsp")
    })
    public String list(){
        return super.list(qsasService);
    }

    @Action(value = "profile",results = {
            @Result(name = "success",type = "redirect",location = "/view/qsas/list.jsp"),
            @Result(name = "profile",location = "/view/qsas/profile.jsp")
    })
    public String profile(){//更新信息
        if(super.profile(qsasService)){
            qsasService.update(t);
            return "success";
        }else{
            return "profile";
        }
    }

    @Action(value = "add",results = {
            @Result(name = "success",type = "redirect",location = "/view/qsas/list.jsp")
    })
    public String save(){

         qsasService.save(t);
        return SUCCESS;
    }

    @Action(value = "delete",results = {
            @Result(name = "success",type = "redirect",location = "/view/qsas/list.jsp")
    })
    public String delete(){
       qsasService.delete(qsasService.getObjectById(id));
        return SUCCESS;
    }

}
