package com.njxzc.wlgl.service.application;


import com.njxzc.wlgl.pojo.application.Zyxx;

import java.util.List;

public interface ZyxxService {
    int insert(Zyxx zyxx); //增加操作
    List<Zyxx> queryAll();//查询全部操作
    int deleteByPrimaryKey(Integer id);//根据Id删除
    Zyxx queryById(Integer id);//根据唯一值ID来查询被选中需要更新的职员
    void updateByPrimaryKeySelective(Zyxx zyxx);//更新操作


}
