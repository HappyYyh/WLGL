package com.njxzc.wlgl.service.transfer;

import com.njxzc.wlgl.pojo.Transfer.Zzxx;

import java.util.List;

public interface ZzxxService {

    int add(Zzxx zzxx);

    int update(Zzxx zzxx);

    int delete(Integer id);

    List<Zzxx> queryAll();  //查询全部

    Zzxx queryDetail(Integer id);   //查询详细信息

}
