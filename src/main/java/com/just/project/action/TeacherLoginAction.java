package com.just.project.action;

import com.just.project.entity.*;
import com.just.project.service.AdminService;
import com.just.project.service.StudentService;
import com.just.project.service.TeacherService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


@Controller
@Namespace("/teacherlogin")
@ParentPackage("loginDefault")
public class TeacherLoginAction extends AbstractAction< Teacher>{


   // static Logger logger=Logger.getLogger(LoginAction.class);

//    @Resource
//    StudentService studentService;
    @Resource
    TeacherService teacherService;
//    @Resource
//    AdminService adminService;
//    @Action(value = "login1",results = {
//            @Result(name = "success",type = "redirect",location = "/admin/index.jsp")
//    })
//    public String login1() {
//
//        Student login=studentService.loginIn((Student) t);
//        if(login==null)return "noLogin";
//        else{
//            getSession().put("login",login);
//        }
//        //  putInformation();
//        return SUCCESS;
//    }
   @Action(value = "login",results = {
           @Result(name = "success",type = "redirect",location = "/teacher/index.jsp")
   })
   public String login() {

       Teacher login=teacherService.loginIn( t);
      if(login==null)return "noLogin";
       else{
           getSession().put("login",login);
       }
       //  putInformation();
       return SUCCESS;
    }
//    @Action(value = "login3",results = {
//            @Result(name = "success",type = "redirect",location = "/admin/index.jsp")
//   })
//    public String login3() {
//
//        Admin login=adminService.loginIn( t);
//        if(login==null)return "noLogin";
//        else{
//            getSession().put("login",login);
//        }
//        //  putInformation();
//        return SUCCESS;
//    }
    //学生注册
//    @Action(value = "register1",results = {
//            @Result(name = "success",type = "redirect",location = "/admin/index.jsp"),
//
//    })
//    public String register1(){
//
//        Integer id=studentService.save((Student) t);
//       Student login=studentService.getObjectById(id);
//       getSession().put("login",login);
//     //  putInformation();
////        logger.warn("已经注册");
//        return SUCCESS;
//    }
   @Action(value = "register",results = {
            @Result(name = "success",type = "redirect",location = "/teacher/index.jsp"),

   })
    public String register(){

        Integer id=teacherService.save( t);
     Teacher login=teacherService.getObjectById(id);
      getSession().put("login",login);
//        putInformation();
//        logger.warn("已经注册");
       return SUCCESS;
    }
////    @Action(value = "list",results = {
////            @Result(name = "success",type = "redirect",location = "/view/login/list.jsp")
////    })
////    public String list(){
////        return super.list(loginService);
////    }
////
////
////    @Action(value = "add",results = {
////            @Result(name = "success",type = "redirect",location = "/login/list")
////    })
////    public String save(){
////        loginService.save(t);
////        logger.warn("已经保存");
////        return SUCCESS;
////    }
////
////    @Action(value = "delete",results = {
////            @Result(name = "success",type = "redirect",location = "/login/list")
////    })
////    public String delete(){
////        loginService.delete(loginService.getObjectById(id));
////        logger.warn("已经删除");
////        return SUCCESS;
////    }




}
