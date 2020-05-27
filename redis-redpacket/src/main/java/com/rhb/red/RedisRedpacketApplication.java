package com.rhb.red;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.rhb.red.mapper")
public class RedisRedpacketApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisRedpacketApplication.class, args);
    }

}
