package com.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/8/1 - 10:06
 * @apiNote
 */
@Component
@RequestMapping("/student")
public class StuList {

    @RequestMapping("/stu_list")
    public String stu(){
        return "Student";
    }
}
