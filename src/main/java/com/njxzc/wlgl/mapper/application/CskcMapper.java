package com.njxzc.wlgl.mapper.application;

import com.njxzc.wlgl.pojo.application.Cskc;

public interface CskcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cskc record);

    int insertSelective(Cskc record);

    Cskc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cskc record);

    int updateByPrimaryKey(Cskc record);
}