package com.njxzc.wlgl.service.application;

import com.njxzc.wlgl.pojo.application.Sjxx;

import java.util.List;

public interface SjxxService {

    int add(Sjxx sjxx);

    int update(Sjxx sjxx);

    int delete(Integer id);

    List<Sjxx> queryAll();//查询全部

    Sjxx queryDetail(Integer id);//查询详细信息

}
