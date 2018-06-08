package com.njxzc.wlgl.controller;

import com.njxzc.wlgl.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam("userName") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if (!StringUtils.isEmpty(username)&&!StringUtils.isEmpty(password)){
            if(MD5Util.MD5("123456") .equals(MD5Util.MD5(password))){
                session.setAttribute("username",username);
                return "redirect:/main";
            }else {
                map.put("msg","密码不正确");
                return "login";
            }
        }else {
            map.put("msg","用户名和密码不能为空");
            return "login";
        }
    }
}
