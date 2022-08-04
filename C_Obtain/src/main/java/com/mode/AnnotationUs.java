package com.mode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kinoz
 * @Date 2022/8/3 - 16:49
 * @apiNote 使用@RequestParams
 */
@Controller
public class AnnotationUs {
    @RequestMapping("/testRps")
    public String testRps(
            //required代表此参数是否必填,默认为true
            //defaultValue代表默认值,若没传参情况下默认获取指定默认值
            @RequestParam(value = "user_name",defaultValue = "默认名称",required = false) String username,
            @RequestParam(value = "secret",required = true) String password,
            @RequestHeader("Host") String host,
            @RequestHeader("User-Agent") String agent,
            @CookieValue("JSESSIONID") String JSESSIONID){
        //获取到html参数,控制台输出
        System.out.println(username+" "+password);
        System.out.println(host);
        System.out.println(agent);
        System.out.println("cookie参数:"+JSESSIONID);
        return "success";
    }
}
