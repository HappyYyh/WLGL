package com.njxzc.wlgl.serviceimpl.application;

import com.njxzc.wlgl.mapper.application.DqcsMapper;
import com.njxzc.wlgl.pojo.application.Dqcs;
import com.njxzc.wlgl.service.application.DqcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DqcsServiceImpl implements DqcsService {

    @Autowired(required = false)
    DqcsMapper dqcsMapper;

    @Override
    public int add(Dqcs dqcs) {
        return dqcsMapper.insertAndGetId(dqcs);
    }

    @Override
    public int update(Dqcs dqcs) {
        return dqcsMapper.updateByPrimaryKeySelective(dqcs);
    }

    @Override
    public int delete(Integer id) {
        return dqcsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Dqcs> queryAll() {
        return dqcsMapper.queryAll();
    }

    @Override
    public Dqcs queryDetail(Integer id) {
        return dqcsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dqcs> queryAllAndCskc() {
        return dqcsMapper.queryAllAndCskc();
    }
}
