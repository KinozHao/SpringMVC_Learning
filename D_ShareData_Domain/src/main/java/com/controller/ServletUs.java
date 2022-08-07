package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author kinoz
 * @Date 2022/8/5 - 10:52
 * @apiNote 原生servletAPI的使用
 * */
@Controller
public class ServletUs {

    //使用servletAPI向request域对象共享数据
    @RequestMapping("/testServlet")
    public String servlet(HttpServletRequest req){
        req.setAttribute("testRequestScope","共享数据:HttpServletRequest");
        return "success";
    }

    //使用servletAPI向session域对象共享数据
    @RequestMapping("/testSession")
    public String session(HttpSession session){
        session.setAttribute("testSessionScope","共享数据:Session");
        return "success";
    }
    //使用servletAPI向application域对象共享数据
    @RequestMapping("testApplication")
    public String application(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope","共享数据:application");
        return "success";
    }

}
