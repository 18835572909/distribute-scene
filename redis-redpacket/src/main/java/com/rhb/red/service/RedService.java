package com.rhb.red.service;

import com.rhb.api.common.APIResponse;
import com.rhb.api.pojo.RedPacketDetail;
import com.rhb.api.pojo.RedPacketRecord;
import com.rhb.api.pojo.RedPacketRob;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: rhb
 * @description:
 */
public interface RedService {

    /**
     *  发红包
     */
    APIResponse sendRed(Long userId, Integer totalCount, BigDecimal totalAmount);

    /**
     * 抢红包
     */
    APIResponse robRed(String redId, Long userId);

    /**
     * zk-lock
     */
    APIResponse robRedZkLock(String redId, Long userId);



}
