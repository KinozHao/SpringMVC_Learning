package com.mode;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author kinoz
 * @Date 2022/8/3 - 15:32
 * @apiNote 使用servlet api实现参数传递
 * @see AnnotationUs 测试cookieValue
 */
@Controller
public class ServletUs {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/testServletAPI",params = {"username","password"})
    public String index1(HttpServletRequest req){
        //测试cookieValue注解
        HttpSession session = req.getSession();
        //通过原生servlet方法获取前端参数
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));
        System.out.println(session);
        return "success";
    }

    //实体类参数获取测试
    @RequestMapping("/testPOJO")
    public String index2(){
        return "pojo";
    }
    @RequestMapping("/POJO")
    public String index2(User user){
        System.out.println(user);
        return "success";
    }
}
