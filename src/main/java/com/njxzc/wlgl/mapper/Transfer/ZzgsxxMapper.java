package com.njxzc.wlgl.mapper.Transfer;

import com.njxzc.wlgl.pojo.Transfer.Zzgsxx;

public interface ZzgsxxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zzgsxx record);

    int insertSelective(Zzgsxx record);

    Zzgsxx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zzgsxx record);

    int updateByPrimaryKey(Zzgsxx record);
}