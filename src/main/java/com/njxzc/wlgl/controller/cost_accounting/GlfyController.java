package com.njxzc.wlgl.controller.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Gify;
import com.njxzc.wlgl.service.cost_accounting.GifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cost_accounting")
public class GlfyController {

    @Autowired
    GifyService gifyService;

    @RequestMapping("toGify")
    public String toGify(){
        return "cost_accounting/Gify";
    }

    @RequestMapping("GifyAdd")
    public String GifyAdd(Gify gify){
        gifyService.insert(gify);
        return "redirect:/cost_accounting/toGify";
    }

    @RequestMapping("queryGify")
    @ResponseBody
    public ArrayList<Gify> queryGify(@RequestBody Gify gify){
        System.out.print("要查的办公费用:"+gify.toString());
        return  gifyService.query(gify);
    }

    @RequestMapping("/updateGify")
    public String updateGify(Gify gify){
        gifyService.updateByPrimaryKeySelective(gify);
        return "redirect:/cost_accounting/toGify";
    }

    @RequestMapping("/DeleteGify")
    public String DeleteGify(Integer id){
        gifyService.deleteByPrimaryKey(id);
        return "redirect:/cost_accounting/toGify";
    }
}
