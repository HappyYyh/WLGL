package com.njxzc.wlgl.service.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Yywsr;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface YywsrService {

    void add(Yywsr yywsr);

    void update(Yywsr yywsr);

    void delete(Integer id);

    List<Yywsr> queryByCondition(
            @Param("minMoney")Double minMoney, @Param("maxMoney")Double maxMoney,
            @Param("dateStart")Date dateStart, @Param("dateEnd")Date dateEnd
    );
}
