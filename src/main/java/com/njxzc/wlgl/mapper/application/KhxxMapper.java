package com.njxzc.wlgl.mapper.application;
import com.njxzc.wlgl.pojo.application.Khxx;

import java.util.ArrayList;
import java.util.List;

public interface KhxxMapper {

    void insert(Khxx khxx);

    Khxx queryById(Integer id);

    List<Khxx> queryAll();

    int deleteByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(Khxx khxx);

    List<String> queryCustomerName();//查询客户名称
}