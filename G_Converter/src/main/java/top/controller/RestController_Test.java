package top.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kinoz
 * @Date 2022/10/5 14:01
 * @apiNote @RestController注解测试
 * 在类上添加RestController后类中的每个方法具有@ResponseBody的功能
 */
@RestController
public class RestController_Test {

    @RequestMapping("/rcer")
    public String rcer(){
        return "hello world";
    }
}
