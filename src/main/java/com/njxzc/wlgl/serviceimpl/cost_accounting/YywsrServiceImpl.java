package com.njxzc.wlgl.serviceimpl.cost_accounting;

import com.njxzc.wlgl.mapper.cost_accounting.YywsrMapper;
import com.njxzc.wlgl.pojo.cost_accounting.Yywsr;
import com.njxzc.wlgl.service.cost_accounting.YywsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class YywsrServiceImpl implements YywsrService {

    @Autowired
    YywsrMapper yywsrMapper;

    @Override
    public void add(Yywsr yywsr) {
        yywsrMapper.insert(yywsr);
    }

    @Override
    public void update(Yywsr yywsr) {
        yywsrMapper.updateByPrimaryKeySelective(yywsr);
    }

    @Override
    public void delete(Integer id) {
         yywsrMapper.deleteByPrimaryKey(id);
    }


    @Override
    public List<Yywsr> queryByCondition(Double minMoney, Double maxMoney, Date dateStart, Date dateEnd) {
        return yywsrMapper.queryByCondition(minMoney, maxMoney, dateStart, dateEnd);
    }
}
