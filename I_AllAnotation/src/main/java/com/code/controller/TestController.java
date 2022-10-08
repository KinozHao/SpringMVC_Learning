package com.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/10/8 20:54
 * @apiNote
 */
@Controller
public class TestController {
    /*@RequestMapping("/")
    public String index(){
        return "index";
    }*/

    @RequestMapping("/success")
    public String success(){
        //手动制造异常
        System.out.println(1/0);
        return "success";
    }
}
