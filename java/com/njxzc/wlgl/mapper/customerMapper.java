package com.njxzc.wlgl.mapper;

import com.njxzc.wlgl.pojo.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface customerMapper {

    @Insert("insert t_25_khjbxx (CustomerCode,CustomerName,Phone,Fax,Address,PostCode,Linkman,LinkmanMobile,CustomerType,EnterpriseProperty,EnterpriseSize,Email) " +
            "values(#{CustomerCode},#{CustomerName},#{Phone},#{Fax},#{Address},#{PostCode},#{Linkman},#{LinkmanMobile},#{CustomerType},#{EnterpriseProperty},#{EnterpriseSize},#{Email})")
    void addCustomer(Customer customer);

    @Select("select * from t_25_khjbxx")
    ArrayList<Customer> quertCustomer(Customer customer);
}
