package com.njxzc.wlgl.mapper.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Yywsr;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface YywsrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yywsr record);

    Yywsr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yywsr record);

    List<Yywsr> queryByCondition(@Param("minMoney")Double minMoney, @Param("maxMoney")Double maxMoney,
                                 @Param("dateStart")Date dateStart, @Param("dateEnd")Date dateEnd);

}