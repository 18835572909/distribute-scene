package com.rhb.red.service.impl;

import com.rhb.api.pojo.RedPacketDetail;
import com.rhb.api.pojo.RedPacketRecord;
import com.rhb.api.pojo.RedPacketRob;
import com.rhb.red.mapper.RedDetailMapper;
import com.rhb.red.mapper.RedRecordMapper;
import com.rhb.red.mapper.RedRobMapper;
import com.rhb.red.service.RedBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: rhb
 * @date: 2020/5/26 23:23
 * @description:
 */
@EnableAsync
@Service
@Transactional
public class RedBaseServiceImpl implements RedBaseService {

    @Autowired
    RedDetailMapper detailMapper;
    @Autowired
    RedRecordMapper recordMapper;
    @Autowired
    RedRobMapper robMapper;

    @Async
    @Override
    public void saveRedDetail(RedPacketRecord record, List<RedPacketDetail> details) {
        recordMapper.insertSelective(record);
        details.forEach(x->{
            detailMapper.insertSelective(x);
        });
    }

    @Async
    @Override
    public void saveRobRed(RedPacketRob rob) {
        System.out.println("DB："+Thread.currentThread().getName());
        robMapper.insertSelective(rob);
    }
}
