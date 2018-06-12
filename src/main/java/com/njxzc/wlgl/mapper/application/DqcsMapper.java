package com.njxzc.wlgl.mapper.application;

import com.njxzc.wlgl.pojo.application.Dqcs;

import java.util.List;

public interface DqcsMapper {
    int deleteByPrimaryKey(Integer id);

    int insertAndGetId(Dqcs record);

    int insertSelective(Dqcs record);

    Dqcs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dqcs record);

    int updateByPrimaryKey(Dqcs record);

    List<Dqcs> queryAll();

    List<Dqcs> queryAllAndCskc();
}