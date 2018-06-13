package com.njxzc.wlgl.mapper.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Yggz;

public interface YggzMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yggz record);

    int insertSelective(Yggz record);

    Yggz selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yggz record);

    int updateByPrimaryKey(Yggz record);
}