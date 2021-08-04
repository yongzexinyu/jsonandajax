package com.hp.controller;

import com.alibaba.fastjson.JSON;
import com.hp.bean.FormBean;
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

@WebServlet(name = "FormServlet",urlPatterns = "/FormServlet")
public class FormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*super.service(req, resp);*/
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        List<FormBean> students=new ArrayList<>();
        FormBean formBean1=new FormBean();
        formBean1.setId(1);
        formBean1.setBid("[001]");
        formBean1.setXtname("");
        formBean1.setNumber(4);
        formBean1.setJibie("高危");
        formBean1.setBugurl("www.baidu.com");
        formBean1.setBugtype("用户遍历漏洞");
       // formBean1.setRepair(false);
        students.add(formBean1);

        FormBean formBean2=new FormBean();
        formBean2.setId(2);
        formBean2.setBid("[002]");
        formBean2.setXtname("");
        formBean2.setNumber(4);
        formBean2.setJibie("高危");
        formBean2.setBugurl("www.baidu.com");
        formBean2.setBugtype("用户遍历漏洞");
      //  formBean2.setRepair(true);
        students.add(formBean2);

        FormBean formBean3=new FormBean();
        formBean3.setId(3);
        formBean3.setBid("[003]");
        formBean3.setXtname("");
        formBean3.setNumber(4);
        formBean3.setJibie("高危");
        formBean3.setBugurl("www.baidu.com");
        formBean3.setBugtype("用户遍历漏洞");
       // formBean3.setRepair(true);
        students.add(formBean3);

        FormBean formBean4=new FormBean();
        formBean4.setId(4);
        formBean4.setBid("[004]");
        formBean4.setXtname("");
        formBean4.setNumber(4);
        formBean4.setJibie("高危");
        formBean4.setBugurl("www.baidu.com");
        formBean4.setBugtype("用户遍历漏洞");
       // formBean4.setRepair(true);
        students.add(formBean4);

        FormBean formBean5=new FormBean();
        formBean5.setId(5);
        formBean5.setBid("[005]");
        formBean5.setXtname("");
        formBean5.setNumber(4);
        formBean5.setJibie("高危");
        formBean5.setBugurl("www.baidu.com");
        formBean5.setBugtype("用户遍历漏洞");
       // formBean5.setRepair(true);
        students.add(formBean5);

        FormBean formBean6=new FormBean();
        formBean6.setId(6);
        formBean6.setBid("[006]");
        formBean6.setXtname("");
        formBean6.setNumber(4);
        formBean6.setJibie("高危");
        formBean6.setBugurl("www.baidu.com");
        formBean6.setBugtype("用户遍历漏洞");
       // formBean6.setRepair(true);
        students.add(formBean6);

        FormBean formBean7=new FormBean();
        formBean7.setId(7);
        formBean7.setBid("[007]");
        formBean7.setXtname("");
        formBean7.setNumber(4);
        formBean7.setJibie("高危");
        formBean7.setBugurl("www.baidu.com");
        formBean7.setBugtype("用户遍历漏洞");
       // formBean7.setRepair(true);
        students.add(formBean7);

        FormBean formBean8=new FormBean();
        formBean8.setId(8);
        formBean8.setBid("[008]");
        formBean8.setXtname("");
        formBean8.setNumber(4);
        formBean8.setJibie("高危");
        formBean8.setBugurl("www.baidu.com");
        formBean8.setBugtype("用户遍历漏洞");
      //  formBean8.setRepair(true);
        students.add(formBean8);


        FormBean formBean9=new FormBean();
        formBean9.setId(9);
        formBean9.setBid("[009]");
        formBean9.setXtname("");
        formBean9.setNumber(4);
        formBean9.setJibie("高危");
        formBean9.setBugurl("www.baidu.com");
        formBean9.setBugtype("用户遍历漏洞");
      //  formBean9.setRepair(true);
        students.add(formBean9);

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
