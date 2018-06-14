package com.njxzc.wlgl.mapper.Transfer;

import com.njxzc.wlgl.pojo.Transfer.Zzgsxx;

import java.util.ArrayList;
//中转公司
public interface ZzgsxxMapper {
    void deleteByPrimaryKey(Integer id);

    ArrayList<Zzgsxx> queryZzgsxx(Zzgsxx zzgsxx);

    int insert(Zzgsxx record);

    int updateByPrimaryKey(Zzgsxx zzgsxx);
    /*
    int insertSelective(Zzgsxx record);

    Zzgsxx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Zzgsxx record);

    */
}