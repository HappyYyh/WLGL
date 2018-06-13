package com.njxzc.wlgl.serviceimpl.application;

import com.njxzc.wlgl.mapper.application.CskcMapper;
import com.njxzc.wlgl.pojo.application.Cskc;
import com.njxzc.wlgl.service.application.CskcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CskcServiceImpl implements CskcService {

    @Autowired(required = false)
    CskcMapper cskcMapper;

    @Override
    public int add(Cskc cskc) {
        return cskcMapper.insert(cskc);
    }

    @Override
    public int delete(Integer id) {
        return cskcMapper.deleteByPrimaryKey(id);
    }

}
