package com.njxzc.wlgl.service.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Cwfy;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CwfyService {
    int insert(Cwfy cwfy);//添加操作
    List<Cwfy> queryByCondition(@Param("payoutMonth")Date payoutMonth);//根据月份查询
    int deleteByPrimaryKey(Integer id); //根据id删除信息
    int updateByPrimaryKeySelective(Cwfy record); //修改操作
}
