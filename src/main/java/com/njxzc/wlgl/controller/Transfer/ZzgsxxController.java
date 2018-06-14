package com.njxzc.wlgl.controller.Transfer;

import com.njxzc.wlgl.pojo.Transfer.Zzgsxx;
import com.njxzc.wlgl.service.Transfer.ZzgsxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;

@Controller
@RequestMapping("/transfer")
public class ZzgsxxController {

    //来到中转信息公司管理增加界面
    @RequestMapping("/ZzgsxxAdd")
    public String toCityAdd() {
        return "transfer/Zzgsxxadd";
    }

    @RequestMapping("/Zzgsxx")
    public String toCityInfo(){return "transfer/Zzgsxxquery";}

    @Autowired
    ZzgsxxService zs;
    @RequestMapping("/addZzgsxx")
    public String addZzgsxx(Zzgsxx zzgsxx){
        zs.insert(zzgsxx);
        return "transfer/Zzgsxxquery";
    }

    @RequestMapping("queryZzgsxx")
    public @ResponseBody
    ArrayList<Zzgsxx> queryZzgsxx(@RequestBody Zzgsxx zzgsxx){
       // System.out.print("前台传来的中转公司信息"+zzgsxx.toString());
        return zs.queryZzgsxx(zzgsxx);
    }

    @RequestMapping("updateZzgsxx")
    public String updateZzgsxx(Zzgsxx zzgsxx){
        //System.out.print(zzgsxx.toString());
        zs.updateByPrimaryKey(zzgsxx);
        return "transfer/Zzgsxxquery";
    }

    @RequestMapping(value = "deleteZzgsxx")
    public String deleteZzgsxx(@RequestParam("check") Integer[] id){
        System.out.print("zzzzzzzzzzzzzzzzzzzzz");
        for (int i=0; i<id.length; i++){
            System.out.print("要删除的:" + id[i]);
            zs.deleteByPrimaryKey(id[i]);
        }
        return "transfer/Zzgsxxquery";
    }
}
