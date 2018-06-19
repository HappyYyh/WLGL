package com.njxzc.wlgl.mapper.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Gify;

import java.util.ArrayList;

public interface GifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Gify record);

    int insertSelective(Gify record);

    Gify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Gify record);

   // int updateByPrimaryKey(Gify record);

   ArrayList<Gify> query(Gify gify);
}