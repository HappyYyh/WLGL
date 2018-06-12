package com.njxzc.wlgl.controller.application;

import com.njxzc.wlgl.pojo.application.Cskc;
import com.njxzc.wlgl.service.application.CskcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/application")
public class CskcController {

    @Autowired
    CskcService cskcService;

    //添加扩充城市表的记录
    @RequestMapping("/addCskc")
    public String add(Cskc cskc) {
        System.out.println("添加：" + cskc.toString());
        cskcService.add(cskc);
        return "application/Dqcs";
    }

    //删除记录
    @RequestMapping("/deleteCskc")
    public String delete(Integer id) {
        System.out.println("删除：" + id);
        cskcService.delete(id);
        return "application/Dqcs";
    }

}
