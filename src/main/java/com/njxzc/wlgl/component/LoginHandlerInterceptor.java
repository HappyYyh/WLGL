package com.njxzc.wlgl.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    //目标方法执行以前
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        Object username = httpServletRequest.getSession().getAttribute("username");
        if (username==null){
            //未登录，返回登陆页面
            httpServletRequest.setAttribute("msg","没有权限请登录！");
            httpServletRequest.getRequestDispatcher("/").
                    forward(httpServletRequest,httpServletResponse);
            return false;
        }else {
            //已登陆,放行请求
            return true;
        }

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
