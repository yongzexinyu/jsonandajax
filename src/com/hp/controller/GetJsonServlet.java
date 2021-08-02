package com.hp.controller;


import com.alibaba.fastjson.JSON;
import com.hp.bean.Student;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="GetJsonServlet",urlPatterns="/GetJsonServlet")
public class GetJsonServlet extends javax.servlet.http.HttpServlet {


    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    /*   Json是一种轻量级的数据交换格式，采用一种“键：值”对的文本格式来存储和表示数据，在系统交换数据过程中常常被使用，是一种理想的数据交换语言*/
     //web,controller 是提供json数据的，
      //使用fastjson 把 对象转换成json数据

        List<Student> students=new ArrayList<>();
        Student s1= new Student();
      s1.setId(001);
      s1.setAge(21);
      s1.setName("李四");
      students.add(s1);

       Student s2=new Student();
       s2.setId(002);
       s2.setAge(21);
       s2.setName("张三");
        students.add(s2);

       Student s3=new Student();
       s3.setId(003);
       s3.setAge(21);
       s3.setName("王五");
        students.add(s3);
        String s= JSON.toJSONString(students);//把对象转换成json格式的字符串
        System.out.println("s = " + s);
      //输出到前端
      //1.解决乱码
      req.setCharacterEncoding("UTF-8");
      resp.setContentType("text/html;charset=UTF-8");
      resp.setCharacterEncoding("UTF-8");
      //2.开始输出
     PrintWriter writer= resp.getWriter();
     writer.println(s);
     writer.close();

      }
}
