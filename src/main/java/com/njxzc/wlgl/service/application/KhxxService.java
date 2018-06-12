package com.njxzc.wlgl.service.application;
import com.njxzc.wlgl.pojo.application.Khxx;
import java.util.List;

public interface KhxxService {
    void insert(Khxx khxx);

    Khxx queryById(Integer id);

    int deleteByPrimaryKey(Integer id);

    List<Khxx> queryAll();

    void updateByPrimaryKeySelective(Khxx khxx);
}
