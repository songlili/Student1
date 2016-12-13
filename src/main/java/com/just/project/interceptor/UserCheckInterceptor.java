package com.just.project.interceptor;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.log4j.Logger;

import java.util.Map;


public class UserCheckInterceptor extends AbstractInterceptor {


    static Logger logger=Logger.getLogger(UserCheckInterceptor.class);

    public String intercept(ActionInvocation actionInvocation) throws Exception {


        ActionProxy actionProxy = actionInvocation.getProxy();
        String method = actionProxy.getMethod();
        String namespace = actionProxy.getNamespace();
        String action = namespace.substring(namespace.lastIndexOf("/")+1, namespace.length());

        ActionContext actionContext = actionInvocation.getInvocationContext();
        Map<?,?> sessionMap= actionInvocation.getInvocationContext().getSession();
        Object user= (Object) sessionMap.get("login");
        if(user==null){
           // logger.info("没有登录");
            return "noLogin";
        }
        else{
            //logger.debug("已经验证权限");
            return actionInvocation.invoke();
        }


    }
}
