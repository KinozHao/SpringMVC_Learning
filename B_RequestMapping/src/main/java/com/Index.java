package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
