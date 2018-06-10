package com.njxzc.wlgl.controller.application;

import com.njxzc.wlgl.pojo.application.Sjxx;
import com.njxzc.wlgl.service.application.SjxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/application")
public class SjxxController {

    @Autowired
    SjxxService sjxxService;

    //来到司机信息添加页面
    @GetMapping("/sjxx")
    public String toAdd(){
        return "application/SjxxAddAndUpdate";
    }

    //司机信息添加
    @PostMapping("/sjxx")
    public String Add(Sjxx sjxx){
        //System.out.println(sjxx.toString());
        sjxxService.add(sjxx);
        return "redirect:/application/sjxxs";
    }

    //司机信息查询
    @GetMapping("/sjxxs")
    public String query(Model model){
        List<Sjxx> list = sjxxService.queryAll();
        model.addAttribute("list", list);
        return "application/SjxxQuery";
    }

    //司机信息详情
    @RequestMapping("/detail")
    @ResponseBody
    public Sjxx showDetail(Integer id){
        return sjxxService.queryDetail(id);
    }

    //来到修改页面
    @GetMapping("/sjxx/{id}")
    public String toUpdate(@PathVariable("id") Integer id,Model model){
        Sjxx sjxx = sjxxService.queryDetail(id);
        model.addAttribute("SJ", sjxx);
        //SjxxAdd是修改添加二合一的页面
        return "application/SjxxAddAndUpdate";
    }

    //修改
    @PutMapping("/sjxx")
    public String update(Sjxx sjxx){
        sjxxService.update(sjxx);
        return "redirect:/application/sjxxs";
    }

    //删除
    /*@DeleteMapping("/sjxx/{id}")
    public String delete(@PathVariable("id") Integer id){
        sjxxService.delete(id);
        return "redirect:/application/sjxxs";
    }*/
    @RequestMapping("SjxxDelete")
    public String delete(Integer id){
        sjxxService.delete(id);
        return "redirect:/application/sjxxs";
    }
}
