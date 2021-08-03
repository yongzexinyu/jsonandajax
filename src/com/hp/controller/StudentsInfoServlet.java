package com.hp.controller;

import com.alibaba.fastjson.JSON;
import com.hp.bean.Student;
import com.hp.bean.StudentInfo;

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

@WebServlet(name = "StudentsInfoServlet",urlPatterns = "/StudentsInfoServlet")
public class StudentsInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*super.service(req, resp);*/
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        List<StudentInfo> students=new ArrayList<>();

        StudentInfo s1=new StudentInfo();
        s1.setName("大娃");
        s1.setAge(15);
        s1.setClazz("一班");
        students.add(s1);

        StudentInfo s2=new StudentInfo();
        s2.setName("二娃");
        s2.setAge(15);
        s2.setClazz("一班");
        students.add(s2);

        StudentInfo s3=new StudentInfo();
        s3.setName("三娃");
        s3.setAge(15);
        s3.setClazz("一班");
        students.add(s3);
        StudentInfo s4=new StudentInfo();

        s4.setName("四娃");
        s4.setAge(15);
        s4.setClazz("一班");
        students.add(s4);

        StudentInfo s5=new StudentInfo();

        s5.setName("五娃");
        s5.setAge(15);
        s5.setClazz("一班");
        students.add(s5);

        StudentInfo s6=new StudentInfo();

        s6.setName("六娃");
        s6.setAge(15);
        s6.setClazz("一班");
        students.add(s6);

        StudentInfo s7=new StudentInfo();

        s7.setName("七娃");
        s7.setAge(15);
        s7.setClazz("一班");
        students.add(s7);

        StudentInfo n1=new StudentInfo();

        n1.setName("张三");
        n1.setAge(15);
        n1.setClazz("一班");
        students.add(n1);

        StudentInfo n2=new StudentInfo();

        n2.setName("李四");
        n2.setAge(15);
        n2.setClazz("一班");
        students.add(n2);

        StudentInfo n3=new StudentInfo();

        n3.setName("李四");
        n3.setAge(15);
        n3.setClazz("一班");
        students.add(n3);

        StudentInfo n4=new StudentInfo();

        n4.setName("王五");
        n4.setAge(15);
        n4.setClazz("一班");
        students.add(n4);

        StudentInfo n5=new StudentInfo();

        n5.setName("赵六");
        n5.setAge(15);
        n5.setClazz("一班");
        students.add(n5);

        StudentInfo n6=new StudentInfo();

        n6.setName("田七");
        n6.setAge(15);
        n6.setClazz("一班");
        students.add(n6);

        StudentInfo c1=new StudentInfo();

        c1.setName("孙悟空");
        c1.setAge(15);
        c1.setClazz("一班");
        students.add(c1);

        StudentInfo c2=new StudentInfo();

        c2.setName("猪八戒");
        c2.setAge(15);
        c2.setClazz("一班");
        students.add(c2);

        StudentInfo c3=new StudentInfo();

        c3.setName("沙和尚");
        c3.setAge(15);
        c3.setClazz("一班");
        students.add(c3);

        StudentInfo c4=new StudentInfo();

        c4.setName("唐三藏");
        c4.setAge(15);
        c4.setClazz("一班");
        students.add(c4);
        //去自己创建一个layui后台的json格式
        Map map=new HashMap<>();
        map.put("code",0);//默认必须是0不然不显示
        map.put("msg","啥都行");
        map.put("count",14);
        map.put("data",students);
//在页面上输出
        String s= JSON.toJSONString(map);
        PrintWriter writer= resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
