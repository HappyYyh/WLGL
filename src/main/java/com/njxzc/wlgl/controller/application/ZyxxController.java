package com.njxzc.wlgl.controller.application;

import com.njxzc.wlgl.pojo.application.Sjxx;
import com.njxzc.wlgl.pojo.application.Zyxx;
import com.njxzc.wlgl.service.application.SjxxService;
import com.njxzc.wlgl.service.application.ZyxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/application")
public class ZyxxController {

    @Autowired
    ZyxxService zyxxService;

    //来到职员信息添加页面
    @GetMapping("/zyxx")
    public String toAdd(){
        return "application/ZyxxAddAndUpdate";
    }

    //职员信息添加
    @PostMapping("/zyxx")
    public String Add(Zyxx zyxx){

        zyxxService.insert(zyxx);
        return "redirect:/application/zyxxs";
    }

    //职员信息查询
    @GetMapping("/zyxxs")
    public String query(Model model){
        List<Zyxx> list = zyxxService.queryAll();
        model.addAttribute("list", list);
        return "application/ZyxxQuery";
    }

    //来到修改页面
    @GetMapping("/zyxx/{id}")
    public String toUpdate(@PathVariable("id") Integer id,Model model){
        Zyxx zyxx = zyxxService.queryById(id);
        model.addAttribute("ZY", zyxx);
        //SjxxAdd是修改添加二合一的页面
        return "application/ZyxxAddAndUpdate";
    }

    //修改
    @PutMapping("/zyxx")
    public String update(Zyxx zyxx){
      zyxxService.updateByPrimaryKeySelective(zyxx);
        return "redirect:/application/zyxxs";
    }

 //删除操作
    @RequestMapping("ZyxxDelete")
    public String delete(Integer id){
        zyxxService.deleteByPrimaryKey(id);
        return "redirect:/application/zyxxs";
    }
}
