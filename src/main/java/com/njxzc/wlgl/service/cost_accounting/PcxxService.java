package com.njxzc.wlgl.service.cost_accounting;

import com.njxzc.wlgl.pojo.cost_accounting.Pcxx;

import java.util.Date;
import java.util.List;

public interface PcxxService {

    void add(Pcxx pcxx);

    void update(Pcxx pcxx);

    void delete(Integer id);

    List<Pcxx> queryByConditon(String name, String place, Date start, Date end);
}
