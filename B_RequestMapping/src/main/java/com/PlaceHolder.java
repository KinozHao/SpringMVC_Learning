package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/8/3 - 10:45
 * @apiNote 占位符使用
 */
@Controller
public class PlaceHolder {
    @RequestMapping("/PhTest/{id}/{name}")
    public String PhTest(@PathVariable("id")String id,@PathVariable("name")String name){
        System.out.println("id:"+id+" name:"+name);
        return "valueTest";
    }
}
