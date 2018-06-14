package com.njxzc.wlgl.serviceimpl.Transfer;

import com.njxzc.wlgl.pojo.Transfer.Zzgsxx;
import com.njxzc.wlgl.service.Transfer.ZzgsxxService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZzgsxxServiceImplTest {

    @Autowired
    ZzgsxxService zs;
    @Test
    public void insert() {
        Zzgsxx zzgsxx = new Zzgsxx();
        zzgsxx.setId(1);
        zzgsxx.setCity("南京");
        zzgsxx.setCompanyName("呵呵");
        zzgsxx.setLinkPhone("123123213");
        zzgsxx.setDetailAddress("葫芦山葫芦岛");
        zs.insert(zzgsxx);
        System.out.print(zzgsxx.toString());

    }

    @Test
    public void testquery(){
        Zzgsxx zzgsxx = new Zzgsxx();
        ArrayList<Zzgsxx> zzgsxxes = new ArrayList<>();
        zzgsxxes = zs.queryZzgsxx(zzgsxx);
        System.out.print(zzgsxxes);
    }

    /*@Test
    public  void testdelete(){


        zs.deleteByPrimaryKey(4);

    }*/
}