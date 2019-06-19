package com.taoj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hi")
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){
        System.out.println("进入Controller的sayHello方法");
        System.out.println("退出Controller的sayHello方法");
        return "jjjjjjjjjjjjjjjj";
    }
}
