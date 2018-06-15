package com.njxzc.wlgl;

import com.njxzc.wlgl.mapper.application.SjxxMapper;
import com.njxzc.wlgl.mapper.cost_accounting.PcxxMapper;
import com.njxzc.wlgl.mapper.cost_accounting.YywsrMapper;
import com.njxzc.wlgl.pojo.cost_accounting.Pcxx;
import com.njxzc.wlgl.pojo.cost_accounting.Yywsr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WlglApplicationTests {

    @Autowired
    SjxxMapper sjxxMapper;

    @Autowired
    YywsrMapper yywsrMapper;

    @Autowired
    DataSource dataSource;

    @Autowired
    PcxxMapper pcxxMapper;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void testAddYywsr() throws ParseException {

        Yywsr yywsr = new Yywsr(2,"顾客002贿赂20000元",20000.00,sdf1.parse("2018-06"),sdf.parse("2018-6-2 12:26:27"));
        yywsrMapper.insert(yywsr);
        System.out.println("插入成功。。。。"+yywsr.toString());
    }

    @Test
    public void testTime() throws ParseException {
         List<Yywsr> list = yywsrMapper.queryByCondition(1.0,200.0,
                                                         sdf.parse("2018-5-29 12:26:27"),
                                                         sdf.parse("2018-6-1 17:26:27"));
        List<Yywsr> list1 = yywsrMapper.queryByCondition(null, null, null, null);
        for (Yywsr yywsr:list1) {
            System.out.println(yywsr.toString());
        }
    }

    @Test
    public void testQueryPcxx(){
        List<Pcxx> list = pcxxMapper.queryByCondition
                ("三","",null,null);
        for (Pcxx x:list){
            System.out.println(x.toString());
        }
    }

}
