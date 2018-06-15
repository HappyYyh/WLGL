package com.njxzc.wlgl.controller.application;

import com.njxzc.wlgl.pojo.application.Khxx;
import com.njxzc.wlgl.service.application.KhxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/application")
public class KhxxController {

    @Autowired
    KhxxService ks;

    //来到客户信息添加页面
    @GetMapping("/khxx")
    public String toAdd(){
        return "application/KhxxAddAndUpdate";
    }

    //司机信息添加
    @PostMapping("/khxx")
    public String Add(Khxx khxx){
        ks.insert(khxx);
        return "redirect:/application/khxxs";
    }

    //来到修改页面
    @GetMapping("/khxx/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model){
        Khxx khxx = ks.queryById(id);
        model.addAttribute("KH", khxx);
        //KhxxAdd是修改添加二合一的页面
        return "application/KhxxAddAndUpdate";
    }

    //客户信息查询
    @GetMapping("/khxxs")
    public String query(Model model){
        List<Khxx> list = ks.queryAll();
        model.addAttribute("list", list);
        return "application/KhxxQuery";
    }

    //修改
    @PutMapping("/khxx")
    public String update(Khxx khxx){
        ks.updateByPrimaryKeySelective(khxx);
        return "redirect:/application/khxxs";
    }

    //删除操作
    @RequestMapping("KhxxDelete")
    public String delete(Integer id){
        ks.deleteByPrimaryKey(id);
        return "redirect:/application/khxxs";
    }

    //查询客户名称
    @RequestMapping("/queryCustomerName")
    @ResponseBody
    public List<String> queryCustomerName(){
        return ks.queryCustomerName();
    }
}
