package com.example.pet2.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    /*@Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {
        Object obj = request.getSession().getAttribute("adminname");
        System.out.println(obj);
        if(obj==null){
            //response.sendRedirect("/");
            //response.sendRedirect("http://localhost:8080/web/admin/login.html");
            request.getRequestDispatcher("/web/admin/login.html").forward(request, response);
            return false;
        }
        else {
            return true;
        }
    }*/
}
