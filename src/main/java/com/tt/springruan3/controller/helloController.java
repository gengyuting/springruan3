package com.tt.springruan3.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/** @作者：GG
*   @时间：2018/11/3 9:32
*   @描述：
*/
//@RestController:这是一个组合注解，包含@Controller @ResponseBody
//@SpringBootApplication
    @Controller
public class helloController {
    /** @作者：GG
    *   @时间：2018/11/3 9:41
    *   @类名：helloController
    *   @描述：
    */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello";
    }

    //登录页面的请求
     @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}

