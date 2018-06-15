package com.njxzc.wlgl.controller.cost_accounting;

import com.njxzc.wlgl.pojo.application.Zyxx;
import com.njxzc.wlgl.pojo.cost_accounting.Yggz;
import com.njxzc.wlgl.service.application.ZyxxService;
import com.njxzc.wlgl.service.cost_accounting.YggzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cost_accounting")
public class YggzController {
    @Autowired
    YggzService yggzService;

    //从员工工资表中查出来来员工工资
    @GetMapping("ygxx")
    public String queryZy(Model model){
        List<Yggz> list =yggzService.queryAll();
        model.addAttribute("list",list);
        return "cost_accounting/YggzQuery";
    }

    @PostMapping("update")
    public  String update(Yggz yggz){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+yggz);
        yggzService.update(yggz);
        return "redirect:/cost_accounting/ygxx";
    }



/*
    //把员工号和员工姓名值传过来到修改界面
    @GetMapping("/insertHtml/{employeeCode},{employee}")
    public String insert(@PathVariable("employeeCode") Integer employeeCode,@PathVariable("employee") Integer employee, Model model){
        model.addAttribute(employeeCode);
        model.addAttribute(employee);
      return "cost_accounting/ZygzUpdate";

    }*/
}
