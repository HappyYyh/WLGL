package com.njxzc.wlgl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.njxzc.wlgl.mapper.*")
public class WlglApplication {

    public static void main(String[] args) {
        SpringApplication.run(WlglApplication.class, args);
    }
}
