package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/8/8 - 20:14
 * @apiNote
 */
@Controller
public class Index {
    @RequestMapping("/")
    public String HomePage(){
        return "index";
    }

    @RequestMapping("/return")
    public String SuccessPage(){
        return "index";
    }
}
