package com.njxzc.wlgl.controller.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Cwfy;
import com.njxzc.wlgl.service.cost_accounting.CwfyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/cost_accounting")
public class CwfyController {
    @Autowired
    CwfyService cwfyService;

    @GetMapping("toHtml")
    public String toHtml(){
        return "/cost_accounting/Cwfy";
    }

    @PostMapping("CwfwAdd")
    public String add(Cwfy cwfy){
        cwfyService.insert(cwfy);
        return "redirect:/cost_accounting/toHtml";
    }

    @RequestMapping("/CwfyQuery")
    @ResponseBody
    public List<Cwfy> CwfyQuery(Date payoutMonth){
       return cwfyService.queryByCondition(payoutMonth);
    }

    @RequestMapping("/CwfyDelete")
    public String delete(Integer id){
   cwfyService.deleteByPrimaryKey(id);
        return "redirect:/cost_accounting/toHtml";
    }
    @RequestMapping("/CwfyUpdate")
    public String update(Cwfy cwfy){
        cwfyService.updateByPrimaryKeySelective(cwfy);
        return "redirect:/cost_accounting/toHtml";
    }

}
