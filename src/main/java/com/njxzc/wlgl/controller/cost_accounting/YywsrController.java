package com.njxzc.wlgl.controller.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Yywsr;
import com.njxzc.wlgl.service.cost_accounting.YywsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/cost_accounting")
public class YywsrController {

    @Autowired
    YywsrService yywsrService;

    /**
     * 跳转到cost_accounting下的Yywsr.html页面
     * @return
     */
    @RequestMapping("toYywsr")
    public String toYywsr(){
        //System.out.println("---------"+date);
        return "cost_accounting/Yywsr";
    }

    /**
     * 使用重定向防止表单重复提交
     * @param yywsr
     * @return
     */
    @RequestMapping("/YywsrAdd")
    public String Add(Yywsr yywsr){
       yywsrService.add(yywsr);
       return "redirect:/cost_accounting/toYywsr";
    }

    @RequestMapping("/YywsrUpdate")
    public String Update(Yywsr yywsr){
        yywsrService.update(yywsr);
        return "redirect:/cost_accounting/toYywsr";
    }

    @RequestMapping("/YywsrDelete")
    public String Delete(Integer id){
        yywsrService.delete(id);
        return "redirect:/cost_accounting/toYywsr";
    }

    /**
     *
     * @param minMoney：最小输入金额
     * @param maxMoney：最大输入金额
     * @param dateStart：填写开始日期
     * @param dateEnd：填写结束日期
     * @return
     * @throws ParseException
     */
    @RequestMapping("/YywsrQuery")
    @ResponseBody
    public List<Yywsr> query(Double minMoney, Double maxMoney,
                             Date dateStart, Date dateEnd){
        List<Yywsr> list = yywsrService.queryByCondition(minMoney, maxMoney, dateStart, dateEnd);
        //System.out.println(dateStart+"---"+dateEnd);
        return list;
    }
}
