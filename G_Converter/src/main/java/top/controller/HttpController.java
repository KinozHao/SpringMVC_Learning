package top.controller;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.entity.Book;

import javax.servlet.ServletResponse;

/**
 * @author kinoz
 * @Date 2022/10/4 13:46
 * @apiNote 请求头注解和请求实体类型的使用
 */
@Controller
public class HttpController {

    @RequestMapping(value = "/testRequestBody")
    public String trb(@RequestBody String body){
        System.out.println("body:"+body);
        return "success";
    }

    @RequestMapping(value = "/testRequestEntity")
    public String tre(RequestEntity<String> entity){    //获取整个请求报文信息
        System.out.println("请求头:"+entity.getHeaders());
        System.out.println("请求体:"+entity.getBody());
        return "success";
    }

    //回顾javaWeb:HTTPServletResponse实现向页面响应数据
    //produces参数在此处无效,依然存在中文乱码
    @RequestMapping(value = "/testServletResponse")
    public void tsre(ServletResponse resp) throws Exception{
        resp.getWriter().println("This data comes from java and responds to the html");
        resp.getWriter().println("此数据来自java并响应html");
    }

    @RequestMapping(value = "/testResponseBody",produces = "text/html;charset=utf-8")
    @ResponseBody   //当存在此注解时，返回值作为数据响应到页面
    public String trby(){
        return "这是一句话";
    }


    // Q:
    // org.springframework.http.converter.HttpMessageNotWritableException:
    // No converter for [class top.entity.Book] with preset Content-Type 'null'
    // F:去掉RequestMapping中的produces参数
    @RequestMapping(value = "/testResponseBook")
    @ResponseBody   //当存在此注解时，返回值作为数据响应到页面
    public Book trbb(){
        return new Book(1001,"挪威的森林","28.99$");
    }

    //ajax页面不进行跳转的情况下，与服务器进行交互
    @RequestMapping(value = "/testAxios",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String tas(String username,String password){
        System.out.println("用户:"+username);
        System.out.println("密码:"+password);
        return "ajax与服务器的交互信息";
    }
}
