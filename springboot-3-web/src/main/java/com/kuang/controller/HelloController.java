package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//templates目录下的所有页面 只能通过controller来跳转
//这需要模板引擎的支持 thymeleaf
@Controller
public class HelloController {

    @RequestMapping("/test")
    public String hello(Model model){
        model.addAttribute("msg","hello,world");
        return "test";
    }

}
