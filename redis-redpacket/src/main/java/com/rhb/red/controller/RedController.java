package com.rhb.red.controller;

import com.rhb.api.common.APIResponse;
import com.rhb.red.service.RedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author: rhb
 * @date: 2020/5/26 22:47
 * @description:
 */
@RestController
@RequestMapping("red")
public class RedController {

    @Autowired
    RedService redService;
    @Autowired
    AsyncTest test;

    /**
     *  发红包
     */
    @RequestMapping("send")
    APIResponse sendRed(Long userId, Integer totalCount, BigDecimal totalAmount){
        return redService.sendRed(userId, totalCount, totalAmount);
    }

    /**
     * 抢红包
     */
    @RequestMapping("rob")
    APIResponse robRed(String redId, Long userId){
        return redService.robRed(redId, userId);
    }

}
