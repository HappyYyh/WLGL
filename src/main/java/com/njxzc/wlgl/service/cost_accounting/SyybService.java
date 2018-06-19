package com.njxzc.wlgl.service.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Syyb;

import java.util.Date;
import java.util.List;

public interface SyybService {
    void add(Syyb syyb);

    void update(Syyb syyb);

    void delete(Integer id);

    List<Syyb> queryByConditon(Date start, Date end);
}
