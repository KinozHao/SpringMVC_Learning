package com.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author kinoz
 * @Date 2022/8/7 - 15:42
 * @apiNote 关于SpringMVC相关类使用
 */
@Controller
public class Thyme {
    //ThymeleafView测试
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf(){
        return "testView";
    }

    //InternalResourceView测试:请求转发(了解)
    @RequestMapping("/testIRV")
    public String testIRV(){
        return "forward:/testThymeleaf";
    }

    //RedirectView测试:重定向
    @RequestMapping("/testRV")
    public String testRV(){
        return "redirect:/testThymeleaf";
    }

}
