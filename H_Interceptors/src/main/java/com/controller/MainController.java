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
}
