package com.hp.controller;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "StudentInfoServlet",urlPatterns = "/StudentInfoServlet")
public class StudentInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* super.service(req, resp); */
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String s1 = "{\n"+
       "\"rows\":[{\"name\":\"张三\",\"age\":\"15\",\"class\":\"15网络\"},{\"name\":\"李四\",\"age\":\"22\",\"class\":\"17软件\"},{\"name\":\"王五\",\"age\":\"33\",\"class\":\"16信息\"},{\"name\":\"叫兽\",\"age\":\"21\",\"class\":\"15网络\"}]}";

        //2.开始输出
        PrintWriter writer= resp.getWriter();
        writer.println(s1);
        writer.close();
       
    }
}
