package com.njxzc.wlgl.mapper.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Cwfy;
import com.njxzc.wlgl.pojo.cost_accounting.Yywsr;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CwfyMapper {
    int deleteByPrimaryKey(Integer id); //根据id删除信息

    int insert(Cwfy record); //添加财务信息操作

    List<Cwfy> queryByCondition(@Param("payoutMonth")Date payoutMonth);//根据月份查询

    int insertSelective(Cwfy record);

    Cwfy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cwfy record); //修改操作

    int updateByPrimaryKey(Cwfy record);
}