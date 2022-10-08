package com.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author kinoz
 * @Date 2022/10/8 20:04
 * @apiNote
 */
//标识当前类为异常处理的组件
@ControllerAdvice
public class ExceptionController {
    //设置所标识方法处理的异常
    @ExceptionHandler(ArithmeticException.class)
    public String handlerArithmeticException(Exception ex, Model model){    //Exception形参通过model共享到前端
        model.addAttribute("ex",ex);
        return "error";
    }
}
