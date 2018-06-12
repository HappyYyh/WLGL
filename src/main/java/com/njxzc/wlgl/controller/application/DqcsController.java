package com.njxzc.wlgl.controller.application;

import com.njxzc.wlgl.pojo.application.Cskc;
import com.njxzc.wlgl.pojo.application.Dqcs;
import com.njxzc.wlgl.service.application.CskcService;
import com.njxzc.wlgl.service.application.DqcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/application")
public class DqcsController {

    @Autowired
    DqcsService dqcsService;
    @Autowired
    CskcService cskcService;

    //来到城市信息页面
    @RequestMapping("/dqcs")
    public String toCityInfo() {
        return "application/Dqcs";
    }

//    //查询所有城市信息
//    @RequestMapping("/dqcss")
//    public @ResponseBody
//    List<Dqcs> query() {
//        return dqcsService.queryAll();
//    }

    //查询所有城市信息
    @RequestMapping("/dqcss")
    public @ResponseBody
    List<Dqcs> query() {
        return dqcsService.queryAllAndCskc();
    }

    //删除
    @RequestMapping("/DqcsDelete")
    public String delete(Integer id) {
        System.out.println("要删除的ID：" + id);
        dqcsService.delete(id);
        return "application/Dqcs";
    }

    //添加
    @RequestMapping("/addDqcs")
    public String add(Dqcs dqcs) {
        System.out.println("前台填写的添加：" + dqcs.toString());
        dqcsService.add(dqcs);
        System.out.println("添加进数据库的：" + dqcs.toString());
        cskcService.add(new Cskc(dqcs.getId()));
        return "application/Dqcs";
    }

    //更新
    @RequestMapping("/updateDqcs")
    public String update(Dqcs dqcs) {
        System.out.println("更新：" + dqcs.toString());
        dqcsService.update(dqcs);
        return "application/Dqcs";
    }

}
