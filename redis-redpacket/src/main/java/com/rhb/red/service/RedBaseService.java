package com.rhb.red.service;

import com.rhb.api.pojo.RedPacketDetail;
import com.rhb.api.pojo.RedPacketRecord;
import com.rhb.api.pojo.RedPacketRob;

import java.util.List;

/**
 * @author: rhb
 * @date: 2020/5/26 23:23
 * @description:
 */
public interface RedBaseService {

    /**
     * 红包记录
     */
    void saveRedDetail(RedPacketRecord record, List<RedPacketDetail> detail);

    /**
     * 抢红包记录
     */
    void saveRobRed(RedPacketRob rob);
}
