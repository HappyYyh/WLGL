package com.njxzc.wlgl.serviceimpl.cost_accounting;

import com.njxzc.wlgl.mapper.cost_accounting.YggzMapper;
import com.njxzc.wlgl.pojo.cost_accounting.Yggz;
import com.njxzc.wlgl.service.cost_accounting.YggzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YggzServicelmpl implements YggzService {
    @Autowired
    YggzMapper yggzMapper;


    @Override
    public List<Yggz> queryAll() {
        return yggzMapper.queryAll();
    }

    @Override
    public void update(Yggz yggz) {
        yggzMapper.updateByPrimaryKeySelective(yggz);
    }
}
