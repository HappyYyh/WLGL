package com.njxzc.wlgl.serviceimpl.transfer;

import com.njxzc.wlgl.mapper.Transfer.ZzxxMapper;
import com.njxzc.wlgl.pojo.Transfer.Zzxx;
import com.njxzc.wlgl.service.transfer.ZzxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZzxxServiceImpl implements ZzxxService {

    @Autowired
    ZzxxMapper zzxxMapper;

    @Override
    public int add(Zzxx zzxx) {
        return zzxxMapper.insert(zzxx);
    }

    @Override
    public int update(Zzxx zzxx) {
        return zzxxMapper.updateByPrimaryKeySelective(zzxx);
    }

    @Override
    public int delete(Integer id) {
        return zzxxMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Zzxx> queryAll() {
        return zzxxMapper.queryAll();
    }

    @Override
    public Zzxx queryDetail(Integer id) {
        return zzxxMapper.selectByPrimaryKey(id);
    }

}
