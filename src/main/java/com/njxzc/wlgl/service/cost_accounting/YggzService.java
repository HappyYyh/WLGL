package com.njxzc.wlgl.service.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Yggz;

import java.util.List;

public interface YggzService {

   List<Yggz> queryAll();//查询全部信息
    void update(Yggz yggz);//更新操作
}
