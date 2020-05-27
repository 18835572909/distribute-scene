package com.rhb.red.service.impl;

import com.rhb.api.common.APIResponse;
import com.rhb.api.pojo.RedPacketDetail;
import com.rhb.api.pojo.RedPacketRecord;
import com.rhb.api.pojo.RedPacketRob;
import com.rhb.red.common.RedGenerateUtils;
import com.rhb.red.mapper.RedDetailMapper;
import com.rhb.red.mapper.RedRecordMapper;
import com.rhb.red.mapper.RedRobMapper;
import com.rhb.red.service.RedBaseService;
import com.rhb.red.service.RedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author: rhb
 * @date: 2020/5/26 21:18
 * @description:
 */
@Service
@Transactional
public class RedServiceImpl implements RedService {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    RedBaseService baseService;

    private static final String redis_prefix = "red:";

    @Override
    public APIResponse sendRed(Long userId, Integer totalCount, BigDecimal totalAmount) {

        //校验用户合法性

        //检验用户账户余额

        if(totalCount>0 && totalAmount.doubleValue()>0d){
            List<Integer> details = RedGenerateUtils.generateDetail(totalCount, totalAmount.intValue());
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            String redId = redis_prefix+userId+":"+ uuid;
            redisTemplate.opsForList().leftPushAll(redId,details);
            String redAllCountKey = redId+":totalCount";
            redisTemplate.opsForValue().set(redAllCountKey,totalCount);

            RedPacketRecord record = new RedPacketRecord();
            record.setOptime(new Date());
            record.setRedId(redId);
            record.setTotalAmount(totalAmount);
            record.setTotalCount(totalCount.longValue());
            record.setUserId(userId);
            record.setIsActive(true);

            List<RedPacketDetail> list = new ArrayList<>();
            for(Integer d : details){
                RedPacketDetail detail = new RedPacketDetail();
                detail.setIsActive(true);
                detail.setOptime(new Date());
                detail.setRedAmount(new BigDecimal(d));
                detail.setRedId(redId);
                list.add(detail);
            }
            baseService.saveRedDetail(record,list);

            Map<String,String> restMap = new HashMap<>();
            restMap.put("redId",redId);

            return APIResponse.instance(restMap);
        }

        return APIResponse.instance(1,"发送失败");
    }

    @Override
    public APIResponse robRed(String redId, Long userId) {
        //校验用户合法性

        //校验用户是否已经抢
        String useRobKey = redId + ":rob:" + userId;
        Object o = redisTemplate.opsForValue().get(useRobKey);
        if(o!=null){
            return APIResponse.instance(1,"您已经抢过红包");
        }

        //校验红包个数 : 抢红包
        String redCountKey = redId + ":totalCount";
        Integer count = (Integer) redisTemplate.opsForValue().get(redCountKey);
        if(count>0){
            //校验红包金额
            Integer restAmount = (Integer) redisTemplate.opsForList().rightPop(redId);
            if(restAmount!=null){
                redisTemplate.opsForValue().set(useRobKey,1);
                redisTemplate.opsForValue().increment(redCountKey,-1);

                RedPacketRob rob = new RedPacketRob();
                rob.setIsActive(true);
                rob.setOptime(new Date());
                rob.setRedAmount(new BigDecimal(restAmount));
                rob.setUserId(userId);
                rob.setRedId(redId);
                baseService.saveRobRed(rob);

                Map<String,Integer> restMap = new HashMap<>();
                restMap.put("money",restAmount);
                System.out.println("rob-service:user:"+userId+",amount:"+restAmount);
                return APIResponse.instance(restMap);
            }
        }
        return APIResponse.instance(1,"红包抢完了");
    }

}
