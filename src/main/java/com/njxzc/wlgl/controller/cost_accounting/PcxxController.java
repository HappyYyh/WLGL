package com.njxzc.wlgl.controller.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Pcxx;
import com.njxzc.wlgl.service.cost_accounting.PcxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@RequestMapping("/cost_accounting")
@Controller
public class PcxxController {

    @Autowired
    PcxxService pcxxService;

    /**
     * @return cost_accounting下的Pcxx.html页面
     */
    @RequestMapping("/toPcxx")
    public String toPcxx(){
        return "cost_accounting/Pcxx";
    }

    @PostMapping("/Pcxx")
    public String Add(Pcxx pcxx){
        pcxxService.add(pcxx);
        return "redirect:/cost_accounting/toPcxx";
    }

    @RequestMapping("/PcxxUpdate")
    public String Update(Pcxx pcxx){
        pcxxService.update(pcxx);
        return "redirect:/cost_accounting/toPcxx";
    }

    @RequestMapping("/PcxxDelete")
    public String Delete(Integer id){
        pcxxService.delete(id);
        return "redirect:/cost_accounting/toPcxx";
    }

    /**
     * @param name:顾客名称
     * @param place：收获地点
     * @param start：赔偿开始日期
     * @param end：赔偿结束日期
     * @return
     */
    @GetMapping("/Pcxxs")
    @ResponseBody
    public List<Pcxx> Query(String name, String place, Date start, Date end){
        return pcxxService.queryByConditon(name,place,start,end);
    }
}
