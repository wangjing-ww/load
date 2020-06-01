package com.atguigu.nginx.demo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Value("${server.port}")
    Integer port;
    @ResponseBody
    @RequestMapping("/hello")
    public String test(){
        return "hello , 当前端口号:"+ port;
    }
}
