package com.njxzc.wlgl.serviceimpl.cost_accounting;

import com.njxzc.wlgl.mapper.cost_accounting.GifyMapper;
import com.njxzc.wlgl.pojo.cost_accounting.Gify;
import com.njxzc.wlgl.service.cost_accounting.GifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GifyServiceImpl implements GifyService {

    @Autowired
    GifyMapper gifyMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gifyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Gify gify) {
        return gifyMapper.insert(gify);
    }

    @Override
    public int insertSelective(Gify gify) {
        return gifyMapper.insert(gify);
    }


    @Override
    public Gify selectByPrimaryKey(Integer id) {
        return gifyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Gify gify) {
        return gifyMapper.updateByPrimaryKeySelective(gify);
    }

    @Override
    public ArrayList<Gify> query(Gify gify) {
        return gifyMapper.query(gify);
    }
}
