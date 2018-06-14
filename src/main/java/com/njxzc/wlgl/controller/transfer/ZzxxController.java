package com.njxzc.wlgl.controller.transfer;

import com.njxzc.wlgl.pojo.Transfer.Zzxx;
import com.njxzc.wlgl.service.transfer.ZzxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/transfer")
public class ZzxxController {

    @Autowired
    ZzxxService zzxxService;

    //来到中转信息添加页面
    @GetMapping("/zzxx")
    public String toAdd() {
        return "transfer/ZzxxAddAndUpdate";
    }

    //中转信息添加
    @PostMapping("/zzxx")
    public String Add(Zzxx zzxx) {
        zzxxService.add(zzxx);
        return "redirect:/transfer/zzxxs";
    }

    //中转信息查询
    @GetMapping("/zzxxs")
    public String query(Model model) {
        List<Zzxx> list = zzxxService.queryAll();
        model.addAttribute("list", list);
        return "transfer/ZzxxQuery";
    }

    //中转信息详细查询
    @RequestMapping("/detail")
    public @ResponseBody
    Zzxx showDetail(Integer id) {
        return zzxxService.queryDetail(id);
    }

    //来到修改页面
    @GetMapping("/zzxx/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        Zzxx zzxx = zzxxService.queryDetail(id);
        model.addAttribute("ZZXX", zzxx);
        return "transfer/ZzxxAddAndUpdate";
    }

    //修改
    @PutMapping("/zzxx")
    public String update(Zzxx zzxx) {
        zzxxService.update(zzxx);
        return "redirect:/transfer/zzxxs";
    }

    //删除
    @RequestMapping("/ZzxxDelete")
    public String delete(Integer id) {
        zzxxService.delete(id);
        return "redirect:/transfer/zzxxs";
    }

}
