package com.njxzc.wlgl.mapper.Transfer;

import com.njxzc.wlgl.pojo.Transfer.Zzxx;

import java.util.List;

public interface ZzxxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zzxx record);

    int insertSelective(Zzxx record);

    Zzxx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zzxx record);

    int updateByPrimaryKey(Zzxx record);

    List<Zzxx> queryAll();
}