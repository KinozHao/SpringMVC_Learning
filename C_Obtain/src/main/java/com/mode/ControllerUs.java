package com.mode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/8/3 - 16:10
 * @apiNote 通过控制器方法形参获取,可请求多个同名参数
 */
@Controller
public class ControllerUs {

    @RequestMapping("/testParams")
    //hobby为多个参数,可以使用字符串或字符串数组获取,若使用数组需使用Array.toString
    public String testParams(String username,String password,String hobby){
        System.out.println(username);
        System.out.println(password);
        System.out.println(hobby);
        return "success";
    }
}
