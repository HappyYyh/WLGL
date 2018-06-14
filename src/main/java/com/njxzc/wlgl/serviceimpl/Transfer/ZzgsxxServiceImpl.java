package com.njxzc.wlgl.serviceimpl.Transfer;

import com.njxzc.wlgl.mapper.Transfer.ZzgsxxMapper;
import com.njxzc.wlgl.pojo.Transfer.Zzgsxx;
import com.njxzc.wlgl.service.Transfer.ZzgsxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ZzgsxxServiceImpl implements ZzgsxxService {
//实现类
    @Autowired
    ZzgsxxMapper zzgsxxMapper;

    @Override
    public void deleteByPrimaryKey(Integer id) {
         zzgsxxMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Zzgsxx zzgsxx) {
        return zzgsxxMapper.insert(zzgsxx);
    }

    @Override
    public ArrayList<Zzgsxx> queryZzgsxx(Zzgsxx zzgsxx) {
        return zzgsxxMapper.queryZzgsxx(zzgsxx);
    }

    @Override
    public int updateByPrimaryKey(Zzgsxx zzgsxx) {
        return zzgsxxMapper.updateByPrimaryKey(zzgsxx);
    }
}
