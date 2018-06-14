package com.njxzc.wlgl.service.Transfer;

import com.njxzc.wlgl.pojo.Transfer.Zzgsxx;

import java.util.ArrayList;

public interface ZzgsxxService {

    void deleteByPrimaryKey(Integer id);

    //增加中转公司信息
    int insert(Zzgsxx zzgsxx);
    //查询中转公司信息
    ArrayList<Zzgsxx> queryZzgsxx(Zzgsxx zzgsxx);

    //跟新
    int updateByPrimaryKey(Zzgsxx zzgsxx);
   /* int insertSelective(com.njxzc.wlgl.pojo.Transfer.Zzgsxx record);

    com.njxzc.wlgl.pojo.Transfer.Zzgsxx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(com.njxzc.wlgl.pojo.Transfer.Zzgsxx record);

    int updateByPrimaryKey(com.njxzc.wlgl.pojo.Transfer.Zzgsxx record);*/
}
