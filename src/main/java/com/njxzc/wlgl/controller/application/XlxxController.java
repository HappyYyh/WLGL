package com.njxzc.wlgl.controller.application;

import com.njxzc.wlgl.pojo.application.Xlxx;
import com.njxzc.wlgl.service.application.XlxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/application")
public class XlxxController {

    @Autowired
    XlxxService xlxxService;

    //来到城市信息页面
    @RequestMapping("/xlxx")
    public String toCityInfo() {
        return "application/Xlxx";
    }

    //查询所有线路信息
    @RequestMapping("/xlxxs")
    public @ResponseBody
    List<Xlxx> query() {
        return xlxxService.queryAll();
    }

    //删除
    @RequestMapping("/XlxxDelete")
    public String delete(Integer id) {
        System.out.println("要删除的ID：" + id);
        xlxxService.delete(id);
        return "application/Xlxx";
    }

    //添加
    @RequestMapping("/addXlxx")
    public String add(Xlxx xlxx) {
        System.out.println("添加：" + xlxx.toString());
        xlxxService.add(xlxx);
        return "application/Xlxx";
    }

    //更新
    @RequestMapping("/updateXlxx")
    public String update(Xlxx xlxx) {
        System.out.println("更新：" + xlxx.toString());
        xlxxService.update(xlxx);
        return "application/Xlxx";
    }

}
