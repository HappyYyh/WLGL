package com.njxzc.wlgl.mapper.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Pcxx;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface PcxxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pcxx record);

    Pcxx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pcxx record);

    List<Pcxx> queryByCondition(@Param("customer")String name,
                                @Param("receiveStationName")String place,
                                @Param("startAmendsTime") Date start,
                                @Param("endAmendsTime") Date end);

}