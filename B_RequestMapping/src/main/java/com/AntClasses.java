package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/8/3 - 10:02
 * @apiNote Ant风格路径
 * ?代表任意字符
 * *代表任意0个或多个字符
 * **代表任意一层或多层目录 单独使用
 */
@Controller
public class AntClasses {
    @RequestMapping("/a?a/AntI")
    public String Ant1(){
        return "valueTest";
    }

    @RequestMapping("/a*a/AntII")
    public String Ant2(){
        return "valueTest";
    }

    @RequestMapping("/**/AntIII")
    public String Ant3(){
        return "valueTest";
    }
}
