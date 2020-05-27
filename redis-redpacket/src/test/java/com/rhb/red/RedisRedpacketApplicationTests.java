package com.rhb.red;

import com.rhb.red.common.RedGenerateUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RedisRedpacketApplicationTests {

    public static void main(String[] args) {
        List<Integer> detail = RedGenerateUtils.generateDetail(10, 1000);
        System.out.println(detail);
    }

}
