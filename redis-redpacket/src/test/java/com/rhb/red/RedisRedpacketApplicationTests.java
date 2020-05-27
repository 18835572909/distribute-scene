package com.rhb.red;

import com.rhb.red.common.RedGenerateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

public class RedisRedpacketApplicationTests {

    @Test
    public void t2() {
        List<Integer> detail = RedGenerateUtils.generateDetail(10, 1000);
        System.out.println(detail);
    }

    @Test
    public void t1(){
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }

}
