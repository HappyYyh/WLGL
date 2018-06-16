package com.njxzc.wlgl.mapper.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Yggz;

import java.util.List;

public interface YggzMapper {

    List<Yggz> queryAll();//查询全部
    void updateByPrimaryKeySelective(Yggz yggz);//更新操作


}