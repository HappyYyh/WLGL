package com.njxzc.wlgl.serviceimpl.cost_accounting;

import com.njxzc.wlgl.mapper.cost_accounting.CwfyMapper;
import com.njxzc.wlgl.mapper.cost_accounting.PcxxMapper;
import com.njxzc.wlgl.pojo.cost_accounting.Cwfy;
import com.njxzc.wlgl.service.cost_accounting.CwfyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CwfyServicelmpl implements CwfyService {
    @Autowired
    CwfyMapper cwfyMapper;

    @Override
    public int insert(Cwfy cwfy) {
        return cwfyMapper.insert(cwfy);
    }

    @Override
    public List<Cwfy> queryByCondition(Date payoutMonth) {
        return cwfyMapper.queryByCondition(payoutMonth);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cwfyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Cwfy record) {
        return cwfyMapper.updateByPrimaryKey(record);
    }
}
