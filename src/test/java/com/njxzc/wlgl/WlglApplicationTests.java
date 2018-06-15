package com.njxzc.wlgl;

import com.njxzc.wlgl.mapper.application.SjxxMapper;
import com.njxzc.wlgl.mapper.cost_accounting.YggzMapper;
import com.njxzc.wlgl.pojo.cost_accounting.Yggz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WlglApplicationTests {

    @Autowired
    SjxxMapper sjxxMapper;
    YggzMapper yggzMapper;

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
