package com.rhb.red.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: rhb
 * @date: 2020/5/26 23:33
 * @description:
 */
@Component
public class AsyncTest {

    @Async
    public void async(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-->"+Thread.currentThread().getName());
    }
}
