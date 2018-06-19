package com.njxzc.wlgl.mapper.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Syyb;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SyybMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Syyb record);

    Syyb selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Syyb record);

    List<Syyb> queryByCondition(@Param("startTime") Date start,
                                @Param("endTime") Date end);

}