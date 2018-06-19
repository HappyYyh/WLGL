package com.njxzc.wlgl.controller.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Syyb;
import com.njxzc.wlgl.service.cost_accounting.SyybService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/cost_accounting")
public class SyybController {
    @Autowired
    SyybService syybService;

    @RequestMapping("/toSyyb")
    public String toSyyb() {
        return "cost_accounting/Syyb";
    }

    @PostMapping("/SyybAdd")
    public String add(Syyb syyb) {
        syybService.add(syyb);
        return "redirect:/cost_accounting/toSyyb";
    }

    @RequestMapping("/SyybUpdate")
    public String update(Syyb syyb) {
        syybService.update(syyb);
        return "redirect:/cost_accounting/toSyyb";
    }

    @RequestMapping("/SyybDelete")
    public String delete(Integer id) {
        syybService.delete(id);
        return "redirect:/cost_accounting/toSyyb";
    }

    @GetMapping("/Syybs")
    public @ResponseBody
    List<Syyb> query(Date start, Date end) {
        return syybService.queryByConditon(start, end);
    }

}
