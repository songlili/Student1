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
@Namespace("/teacher")
@ParentPackage("userDefault")
public class TeacherAction extends AbstractAction<Teacher> {
   // static Logger logger=Logger.getLogger(DoctorAction.class);

    @Resource
    TeacherService teacherService;



    @Action(value = "list",results = {
            @Result(name = "success",type = "redirect",location = "/view/teacher/list.jsp")
    })
    public String list(){
        return super.list(teacherService);
    }

    @Action(value = "profile",results = {
            @Result(name = "success",type = "redirect",location = "/view/teacher/list.jsp"),
            @Result(name = "profile",location = "/view/teacher/profile.jsp")
    })
    public String profile(){//更新信息
       // logger.error("测试");
        if(super.profile(teacherService)){
            teacherService.update(t);
            return "success";
        }else{
            return "profile";
        }
    }

    @Action(value = "add",results = {
            @Result(name = "success",type = "redirect",location = "/student/list.jsp")
    })
    public String save(){
         teacherService.save(t);
        return SUCCESS;
    }

    @Action(value = "delete",results = {
            @Result(name = "success",type = "redirect",location = "/student/list.jsp")
    })
    public String delete(){
        teacherService.delete(teacherService.getObjectById(id));
        return SUCCESS;
    }

}
