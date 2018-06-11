package com.njxzc.wlgl.service.impl.application;

import com.njxzc.wlgl.mapper.application.SjxxMapper;
import com.njxzc.wlgl.pojo.application.Sjxx;
import com.njxzc.wlgl.service.application.SjxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SjxxServiceImpl implements SjxxService {

    @Autowired
    SjxxMapper sjxxMapper;

    @Override
    public int add(Sjxx sjxx) {
        return sjxxMapper.insert(sjxx);
    }

    @Override
    public int update(Sjxx sjxx) {
        return sjxxMapper.updateByPrimaryKeySelective(sjxx);
    }

    @Override
    public int delete(Integer id) {
        return sjxxMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Sjxx> queryAll() {
        return sjxxMapper.queryAll();
    }

    @Override
    public Sjxx queryDetail(Integer id) {
        return sjxxMapper.selectByPrimaryKey(id);
    }
}
