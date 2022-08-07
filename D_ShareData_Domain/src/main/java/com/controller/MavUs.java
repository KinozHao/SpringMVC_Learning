package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/8/5 - 20:21
 * @apiNote 其他共享数据域对象的使用
 */
@Controller
public class MavUs {

    //1.ModelAndView
    @RequestMapping("/testMav")
    public ModelAndView mav(){
        ModelAndView modelAndView = new ModelAndView();
        //处理模型数据,即向请求域request共享数据
        modelAndView.addObject("testRequestScope","共享数据:ModelAndView");
        //设置视图名称
        modelAndView.setViewName("/success");
        //返回域对象
        return modelAndView;
    }

    //2.Model
    @RequestMapping("/testModel")
    public String model(Model model){
        model.addAttribute("testRequestScope","共享数据:Model");
        return "success";
    }

    //3.ModelMap
    @RequestMapping("/testModelMap")
    public String modelMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope","共享数据:ModelMap");
        return "success";
    }

    //4.Map
    @RequestMapping("/testMap")
    public String map(Map<String,Object> map){
        map.put("testRequestScope","共享数据:Map");
        return "success";
    }
}
