package com.hp.controller;

import com.alibaba.fastjson.JSON;
import com.hp.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "LayuiServlet",urlPatterns = "/LayuiServlet")
public class LayuiServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*super.service(req, resp);*/
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");


        List<Student> students=new ArrayList<>();


        Student s1=new Student();
     s1.setId(001);
     s1.setName("唐僧");
     s1.setAge(50);
     students.add(s1);
        Student s2=new Student();
        s2.setId(002);
        s2.setName("孙悟空");
        s2.setAge(50);
        students.add(s2);
        Student s3=new Student();
        s3.setId(003);
        s3.setName("猪八戒");
        s3.setAge(50);
        students.add(s3);
//去自己创建一个layui后台的json格式
        Map map=new HashMap<>();
        map.put("code",0);//默认必须是0不然不显示
        map.put("msg","啥都行");
        map.put("count",3);
        map.put("data",students);
//在页面上输出
        String s= JSON.toJSONString(map);
        PrintWriter writer= resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
