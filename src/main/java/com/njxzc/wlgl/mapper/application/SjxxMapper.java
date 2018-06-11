package com.njxzc.wlgl.mapper.application;

import com.njxzc.wlgl.pojo.application.Sjxx;

import java.util.List;

public interface SjxxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sjxx record);

    Sjxx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sjxx record);

    List<Sjxx> queryAll();

}