package com.mode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;

/**
 * @author kinoz
 * @Date 2022/8/3 - 15:32
 * @apiNote 使用servlet api实现参数传递
 */
@Controller
public class ServletUs {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/testServletAPI",params = {"username","password"})
    public String index1(ServletRequest req){
        //通过原生servlet方法获取前端参数
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));
        return "success";
    }
}
