package com.rhb.red.common;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author: rhb
 * @date: 2020/6/2 21:01
 * @description:
 * InterProcessMutex：分布式可重入排它锁
 * InterProcessSemaphoreMutex：分布式排它锁
 * InterProcessReadWriteLock：分布式读写锁
 * InterProcessMultiLock：将多个锁作为单个实体管理的容器
 */
@Configuration
public class CuratorConfiguration {

    @Value("${curator.retryCount}")
    private int retryCount;

    @Value("${curator.elapsedTimeMs}")
    private int elapsedTimeMs;

    @Value("${curator.connectString}")
    private String connectString;

    @Value("${curator.sessionTimeoutMs}")
    private int sessionTimeoutMs;

    @Value("${curator.connectionTimeoutMs}")
    private int connectionTimeoutMs;

    @Value("${curator.namespace}")
    private String namespace;

    @Autowired
    private Environment env;

    @Bean
    public CuratorFramework curatorFramework(){
        CuratorFramework cf = CuratorFrameworkFactory.builder()
                .connectString(connectString)
                .sessionTimeoutMs(sessionTimeoutMs)
                .connectionTimeoutMs(connectionTimeoutMs)
                .namespace(namespace)
                .retryPolicy(new RetryNTimes(retryCount, elapsedTimeMs))
                .build();
        cf.start();
        return cf;
    }
}
