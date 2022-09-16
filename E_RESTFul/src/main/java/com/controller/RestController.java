package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;

/**
 * @author kinoz
 * @Date 2022/8/8 - 20:18
 * @apiNote RESTFUL体现
 */
@Controller
public class RestController {
    //1.查询所有用户信息
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String AllUser(){
        System.out.println("QueryAllSuccess!");
        return "success";
    }

    //2.根据id查询用户信息
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String idUser(){
        System.out.println("QueryByIdSuccess!");
        return "success";
    }

    //3.添加用户信息
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String addUser(String username,String password){
        System.out.println("添加成功:用户名:"+username+" 密码:"+password);
        return "success";
    }

    //4.修改用户信息
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(String username,String password){
        System.out.println("修改成功");
        System.out.println("修改后用户名:"+username+" 密码:"+password);
        return "success";
    }
}
