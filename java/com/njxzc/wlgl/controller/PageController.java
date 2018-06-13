package com.njxzc.wlgl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class PageController {
    @RequestMapping("add")
    public String add(){
        return "khtx";
    }

    @RequestMapping("query")
    public String query(){
        return "khcx";
    }
}
