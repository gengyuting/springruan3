package com.tt.springruan3.controller;

import com.tt.springruan3.pojo.Student;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** @作者：GG
*   @时间：2018/11/9 10:49
*   @描述：这是一个学生的控制器，里面放了关于学生的页面请求和增删改查的操作
*/
@Controller
@RequestMapping("/student")
public class StudentController {
    //获取登录页的请求
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpSession session, Model model) {
        request.setAttribute("request_name","request加进来的");   //给request请求里面，加数据
        session.setAttribute("session_name","session加进来的");   //给session请求里面，加数据
        request.getServletContext().setAttribute("application_name","application加进来的");  //给application真个应用加数据

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"zhang","123"));
        list.add(new Student(2,"song","123"));
        list.add(new Student(3,"nihao","123"));
        //1.检测list内置对象的数据
        model.addAttribute("studentList",list);
        //2.检测string内置对象的数据
        model.addAttribute("phone","110");
        //3.检测date内置对象的数据
        model.addAttribute("date",new Date());
        return "login";
    }

    @RequestMapping(value = "/hai",method = RequestMethod.GET)
    public String hai(HttpServletRequest request,HttpSession session,Model model) {
        //1.给request里面放一些数据
        request.setAttribute("reqJsp","你好jsp，我是request");
        //2.给session里面放一些数据
        session.setAttribute("sesJsp","你好jsp，我是session");
        //3.给application里面放一些数据
        request.getServletContext().setAttribute("appJsp","你好jsp，我是application");
        //4.给Model里面放一些数据,List<Student>
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"zhang","123"));
        list.add(new Student(2,"song","123"));
        list.add(new Student(3,"nihao","123"));
        model.addAttribute("list",list);
        return "hai";
    }
    //获取学生信息的请求接口，名字叫getStudent,方式为Get，请求编码为UTF-8
    @GetMapping(value = "/getStudent",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<Student> getStudent() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"zhang","123"));
        list.add(new Student(2,"song","123"));
        list.add(new Student(3,"nihao","123"));
        return list;
    }
    @GetMapping("/json")
    public String json() {
        return "json";
    }
}
