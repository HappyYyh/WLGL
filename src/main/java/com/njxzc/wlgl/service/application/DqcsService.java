package com.njxzc.wlgl.service.application;

import com.njxzc.wlgl.pojo.application.Dqcs;

import java.util.List;

public interface DqcsService {

    int add(Dqcs dqcs);

    int update(Dqcs dqcs);

    int delete(Integer id);

    List<Dqcs> queryAll();//查询全部

    Dqcs queryDetail(Integer id);//查询详细信息

    List<Dqcs> queryAllAndCskc();//查询全部和扩充城市
}
