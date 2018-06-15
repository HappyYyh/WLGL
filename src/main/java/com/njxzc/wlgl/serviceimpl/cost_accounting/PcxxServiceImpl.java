package com.njxzc.wlgl.serviceimpl.cost_accounting;

import com.njxzc.wlgl.mapper.cost_accounting.PcxxMapper;
import com.njxzc.wlgl.pojo.cost_accounting.Pcxx;
import com.njxzc.wlgl.service.cost_accounting.PcxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PcxxServiceImpl implements PcxxService {

    @Autowired
    PcxxMapper pcxxMapper;


    @Override
    public void add(Pcxx pcxx) {
        pcxxMapper.insert(pcxx);
    }

    @Override
    public void update(Pcxx pcxx) {
        pcxxMapper.updateByPrimaryKeySelective(pcxx);
    }

    @Override
    public void delete(Integer id) {
       pcxxMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Pcxx> queryByConditon(String name, String place, Date start, Date end) {
        return pcxxMapper.queryByCondition(name, place, start, end);
    }


}
