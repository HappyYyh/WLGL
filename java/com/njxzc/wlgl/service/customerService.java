package com.njxzc.wlgl.service;

import com.njxzc.wlgl.pojo.Customer;

import java.util.ArrayList;

public interface customerService {
    void addCustomer(Customer customer);

    ArrayList<Customer> queryCustomer(Customer customer);
}
