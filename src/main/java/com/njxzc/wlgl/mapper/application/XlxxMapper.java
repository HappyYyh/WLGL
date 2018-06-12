package com.njxzc.wlgl.mapper.application;

import com.njxzc.wlgl.pojo.application.Xlxx;

import java.util.List;

public interface XlxxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xlxx record);

    int insertSelective(Xlxx record);

    Xlxx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xlxx record);

    int updateByPrimaryKey(Xlxx record);

    List<Xlxx> queryAll();
}