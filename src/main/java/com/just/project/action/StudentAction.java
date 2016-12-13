package com.just.project.action;

import com.just.project.entity.*;
import com.just.project.service.*;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


@Controller
@Namespace("/student")
@ParentPackage("userDefault")
public class StudentAction extends AbstractAction<Student> {
   // static Logger logger=Logger.getLogger(DoctorAction.class);

    @Resource
    StudentService studentService;



    @Action(value = "list",results = {
            @Result(name = "success",type = "redirect",location = "/view/student/list.jsp")
    })
    public String list(){
        return super.list(studentService);
    }

    @Action(value = "profile",results = {
            @Result(name = "success",type = "redirect",location = "/view/student/list.jsp"),
            @Result(name = "profile",location = "/view/student/profile.jsp")
    })
    public String profile(){//更新信息
        if(super.profile(studentService)){
            studentService.update(t);
            return "success";
        }else{
            return "profile";
        }
    }

    @Action(value = "add",results = {
            @Result(name = "success",type = "redirect",location = "/view/student/list.jsp")
    })
    public String save(){

         studentService.save(t);
        return SUCCESS;
    }

    @Action(value = "delete",results = {
            @Result(name = "success",type = "redirect",location = "/view/student/list.jsp")
    })
    public String delete(){
        studentService.delete(studentService.getObjectById(id));
        return SUCCESS;
    }

}
