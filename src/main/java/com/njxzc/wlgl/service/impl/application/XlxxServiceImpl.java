package com.njxzc.wlgl.service.impl.application;

import com.njxzc.wlgl.mapper.application.XlxxMapper;
import com.njxzc.wlgl.pojo.application.Xlxx;
import com.njxzc.wlgl.service.application.XlxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XlxxServiceImpl implements XlxxService {

    @Autowired(required = false)
    XlxxMapper xlxxMapper;

    @Override
    public int add(Xlxx xlxx) {
        return xlxxMapper.insert(xlxx);
    }

    @Override
    public int update(Xlxx xlxx) {
        return xlxxMapper.updateByPrimaryKeySelective(xlxx);
    }

    @Override
    public int delete(Integer id) {
        return xlxxMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Xlxx> queryAll() {
        return xlxxMapper.queryAll();
    }

    @Override
    public Xlxx queryDetail(Integer id) {
        return xlxxMapper.selectByPrimaryKey(id);
    }

}
