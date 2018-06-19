package com.njxzc.wlgl.serviceimpl.cost_accounting;

import com.njxzc.wlgl.mapper.cost_accounting.SyybMapper;
import com.njxzc.wlgl.pojo.cost_accounting.Syyb;
import com.njxzc.wlgl.service.cost_accounting.SyybService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SyybServiceImpl implements SyybService {

    @Autowired
    SyybMapper syybMapper;

    @Override
    public void add(Syyb syyb) {
        syybMapper.insert(syyb);
    }

    @Override
    public void update(Syyb syyb) {
        syybMapper.updateByPrimaryKeySelective(syyb);
    }

    @Override
    public void delete(Integer id) {
        syybMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Syyb> queryByConditon(Date start, Date end) {
        return syybMapper.queryByCondition(start, end);
    }
}
