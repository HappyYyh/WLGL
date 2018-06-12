package com.njxzc.wlgl.service.impl.application;


import com.njxzc.wlgl.mapper.application.KhxxMapper;
import com.njxzc.wlgl.pojo.application.Khxx;
import com.njxzc.wlgl.service.application.KhxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class KhxxServiceImpl implements KhxxService {

    @Autowired
    KhxxMapper km;

    @Override
    public void insert(Khxx khxx) {
        km.insert(khxx);
    }

    @Override
    public Khxx queryById(Integer id) {
        return km.queryById(id);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return km.deleteByPrimaryKey(id);
    }

    @Override
    public List<Khxx> queryAll() {
        return km.queryAll();
    }

    @Override
    public void updateByPrimaryKeySelective(Khxx khxx) {
        km.updateByPrimaryKeySelective(khxx);
    }


}
