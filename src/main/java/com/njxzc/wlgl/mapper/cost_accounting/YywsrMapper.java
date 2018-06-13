package com.njxzc.wlgl.mapper.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Yywsr;

public interface YywsrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yywsr record);

    int insertSelective(Yywsr record);

    Yywsr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yywsr record);

    int updateByPrimaryKey(Yywsr record);
}