package com.hp.controller;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ShenServlet",urlPatterns = "/ShenServlet")
public class ShenServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*super.service(req, resp);*/
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        String shen=req.getParameter("shen");
        System.out.println("shen"+shen);
        Map hashMap=new HashMap<>();
        hashMap.put("code",0);
        hashMap.put("msg","修改成功");
        hashMap.put("shen","神仙");

        String s= JSON.toJSONString(hashMap);
        PrintWriter writer= resp.getWriter();
        writer.println(s);
        writer.close();
    }
}
