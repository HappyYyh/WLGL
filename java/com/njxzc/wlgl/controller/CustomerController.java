package com.njxzc.wlgl.controller;

import com.njxzc.wlgl.pojo.Customer;
import com.njxzc.wlgl.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    customerService cs;

    @RequestMapping("addCustomer")
    public ModelAndView addCustomer(Customer customer){
        System.out.print("提交的用户信息是:" +customer.toString());
        cs.addCustomer(customer);
        ModelAndView mav =new ModelAndView();
        mav.setViewName("khcx");
        return mav;
    }

    @RequestMapping(value = "queryCustomer")
    public @ResponseBody
    ArrayList<Customer> queryCustomer(@RequestBody Customer customer){
        System.out.print(cs.queryCustomer(customer));
        return cs.queryCustomer(customer);
    }
}
