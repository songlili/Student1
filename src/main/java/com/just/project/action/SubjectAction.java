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
@Namespace("/subject")
@ParentPackage("userDefault")
public class SubjectAction extends AbstractAction<Subject> {
   // static Logger logger=Logger.getLogger(DoctorAction.class);

    @Resource
    SubjectService subjectService;



    @Action(value = "list",results = {
            @Result(name = "success",type = "redirect",location = "/view/subject/list.jsp")
    })
    public String list(){
        return super.list(subjectService);
    }

    @Action(value = "profile",results = {
            @Result(name = "success",type = "redirect",location = "/view/subject/list.jsp"),
            @Result(name = "profile",location = "/view/subject/profile.jsp")
    })
    public String profile(){//更新信息
        if(super.profile(subjectService)){
            subjectService.update(t);
            return "success";
        }else{
            return "profile";
        }
    }

    @Action(value = "add",results = {
            @Result(name = "success",type = "redirect",location = "/subject/list.jsp")
    })
    public String save(){

         subjectService.save(t);
        return SUCCESS;
    }

    @Action(value = "delete",results = {
            @Result(name = "success",type = "redirect",location = "/subject/list.jsp")
    })
    public String delete(){
        subjectService.delete(subjectService.getObjectById(id));
        return SUCCESS;
    }

}
