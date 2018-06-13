package com.njxzc.wlgl.service.impl;

import com.njxzc.wlgl.mapper.customerMapper;
import com.njxzc.wlgl.pojo.Customer;
import com.njxzc.wlgl.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class customerServiceImpl implements customerService {
    @Autowired
    private customerMapper cm;

    @Override
    public void addCustomer(Customer customer) {
        cm.addCustomer(customer);
    }

    @Override
    public ArrayList<Customer> queryCustomer(Customer customer) {
        return cm.quertCustomer(customer);
    }
}
