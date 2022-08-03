package com.succeed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/8/3 - 15:53
 * @apiNote 返回默认首页
 */
@Controller
public class ReturnIndex {
    @RequestMapping("/return")
    public String returnIndex(){
        return "index";
    }
}
