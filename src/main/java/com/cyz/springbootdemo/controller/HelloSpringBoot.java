package com.cyz.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.cyz.springbootdemo.controller
 *
 * @author cuiyongzhi
 * @date 2021/10/10
 */
@Controller
public class HelloSpringBoot {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("heheh");
        return "Hello Spring Boot";
    }
}
