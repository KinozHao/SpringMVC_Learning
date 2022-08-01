package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author kinoz
 * @Date 2022/7/30 - 9:41
 * @apiNote 创建一个控制器
 */
@Controller
public class HelloController {
    // "/"-->WEB-INFO/templates/index.html

    // 通过springMVC配置文件中的thymeleaf视图来读取中间信息
    @RequestMapping(value = "/") //为这个方法创建映射关系
    public String indexMethod(){
        //返回视图名称
        return "index";
        //error: checks if spring mvc view references are resolved correctly
    }

    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }
}
