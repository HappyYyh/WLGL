package com.njxzc.wlgl;

import com.njxzc.wlgl.mapper.application.SjxxMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WlglApplicationTests {

    @Autowired
    SjxxMapper sjxxMapper;

    @Test
    public void contextLoads() {
    }

}
