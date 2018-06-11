package com.njxzc.wlgl.service.impl.application;


import com.njxzc.wlgl.mapper.application.ZyxxMapper;
import com.njxzc.wlgl.pojo.application.Zyxx;
import com.njxzc.wlgl.service.application.ZyxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZyxxServiceImpl implements ZyxxService {

@Autowired
    ZyxxMapper zyxxMapper;

    @Override
    public int insert(Zyxx zyxx) {
        return zyxxMapper.insert(zyxx);
    }

    @Override
    public List<Zyxx> queryAll() {
       return zyxxMapper.queryAll();
    }
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return  zyxxMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Zyxx queryById(Integer id) {
        return zyxxMapper.queryById(id);
    }

    @Override
    public void updateByPrimaryKeySelective(Zyxx zyxx) {
        zyxxMapper.updateByPrimaryKeySelective(zyxx);
    }
}
