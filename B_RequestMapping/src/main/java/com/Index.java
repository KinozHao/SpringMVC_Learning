package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author kinoz
 * @Date 2022/8/1 - 9:31
 * @apiNote
 */
@Controller
public class Index {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    //测试value 数组形式访问多个路径
    @RequestMapping(value = {"/test1","/test2"})
    public String index1(){
        return "valueTest";
    }

    //测试method 指定请求方式
    @RequestMapping(value = "/methods",method = {RequestMethod.GET})
    public String index2(){
        return "valueTest";
    }
    //RequestMapping的派生注解
    @GetMapping("/rm")
    public String index3(){
        return "valueTest";
    }
    @PostMapping("/pm")
    public String index4(){
        return "valueTest";
    }
    //测试params 携带参数
    @RequestMapping(value = "/paramsTest",params = {"username","password!=123456"})
    public String index5(){
        return "valueTest";
    }

    //测试headers属性
    //因为tomcat地址为8080,所以一定会报404错误
    @RequestMapping(value = "headersTest",headers = {"Host=localhost:8081"})
    public String index6(){
        return "valueTest";
    }
}
