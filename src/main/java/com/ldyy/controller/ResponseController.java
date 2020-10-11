package com.ldyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/response")
public class ResponseController {

    @RequestMapping("/testString")
    public String test01(){
        System.out.println("进入test01...");
        return "success";
    }

    /**
     * 测试转发
     */
    @RequestMapping("/forward")
    public void testForward(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
    }
    /**
     * 测试重定向
     */
    @RequestMapping("/redirect")
    public void testRedirect(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getContextPath());
       response.sendRedirect("/WEB-INF/pages/success.jsp");
    }
}
