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


    //����value ������ʽ���ʶ��·��
    @RequestMapping(value = {"/test1","/test2"})
    public String index1(){
        return "valueTest";
    }

    //����method ָ������ʽ
    @RequestMapping(value = "/methods",method = {RequestMethod.GET})
    public String index2(){
        return "valueTest";
    }
    //RequestMapping������ע��
    @GetMapping("/rm")
    public String index3(){
        return "valueTest";
    }
    @PostMapping("/pm")
    public String index4(){
        return "valueTest";
    }
    //����params Я������
    @RequestMapping(value = "/paramsTest",params = {"username","password!=123456"})
    public String index5(){
        return "valueTest";
    }
}
