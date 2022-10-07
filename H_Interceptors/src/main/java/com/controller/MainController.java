package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/10/6 15:11
 * @apiNote
 */
@Controller
public class MainController {

    //使用ant风格
    @RequestMapping("/**/testInterceptors")
    public String tis(){
        return "success";
    }

    @RequestMapping("/testExceptionHandler")
    public String teh(){
        //手动制造错误,触发bean中配置的异常
        System.out.println(1/0);
        return "success";
    }
}
