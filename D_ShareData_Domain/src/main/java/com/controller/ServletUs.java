package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kinoz
 * @Date 2022/8/5 - 10:52
 * @apiNote 原生HttpServletRequest的使用
 * */
@Controller
public class ServletUs {

    //使用servletAPI向request域对象shareData
    @RequestMapping("/testServlet")
    public String servlet(HttpServletRequest req){
        req.setAttribute("testRequestScope","共享数据:HttpServletRequest");
        return "success";
    }



}
