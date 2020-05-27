package com.rhb.red.common;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.InitBinder;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.params.SetParams;

import javax.annotation.PostConstruct;
import java.util.Collections;

/**
 * @author: rhb
 * @date: 2020/5/27 21:13
 * @description: redis分布式锁
 */
@Component
public class RedisLock {

    @Autowired
    private JedisPool jedisPool;

    private static final String REDIS_LOCK_KEY_PREFIX = "redis:lock:";
    private static final long TRY_LOCK_TIMEOUT = 60000;      //获取锁超时
    private static final long EXPIRE_LOCK_TIME = 30000;      //ttl

    public boolean lock(String key,String value){
        Jedis jedis = jedisPool.getResource();
        SetParams setParams = SetParams.setParams().nx().px(EXPIRE_LOCK_TIME);
        long requestStartTime = System.currentTimeMillis();
        try{
            while(true){
                String rep = jedis.set(REDIS_LOCK_KEY_PREFIX+key, value, setParams);
                if (StringUtils.equals(rep,"OK")){
                    return true;
                }
                long currentTime = System.currentTimeMillis();
                if(currentTime-requestStartTime>=TRY_LOCK_TIMEOUT){
                    return false;
                }
                //间隔获取
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }finally {
            jedis.close();
        }

    }

    public boolean unLock(String key,String value){
        Jedis jedis = jedisPool.getResource();
        String scripe = "if redis.call('get',KEYS[1])==ARGV[1] then return redis.call('del',KEYS[1]) else return 0 end";
        try{
            Object eval = jedis.eval(scripe, Collections.singletonList(REDIS_LOCK_KEY_PREFIX+key), Collections.singletonList(value));
            if(StringUtils.equals(eval.toString(),"1"))
                return true;
            else
                return false;
        }finally {
            jedis.close();
        }
    }
}
