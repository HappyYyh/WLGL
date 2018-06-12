package com.njxzc.wlgl.service.application;

import com.njxzc.wlgl.pojo.application.Xlxx;

import java.util.List;

public interface XlxxService {
    int add(Xlxx xlxx);

    int update(Xlxx xlxx);

    int delete(Integer id);

    List<Xlxx> queryAll();//查询全部

    Xlxx queryDetail(Integer id);//查询详细信息
}
