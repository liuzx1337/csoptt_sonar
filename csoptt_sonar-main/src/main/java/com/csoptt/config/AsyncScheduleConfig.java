package com.csoptt.config;

import com.csoptt.properties.ThreadPoolExecutorProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 多线程定时任务配置
 *
 * @author qishao
 * @date 2018-12-22
 */
@Configuration
@EnableAsync
public class AsyncScheduleConfig {

    /**
     * 线程池配置项
     */
    @Autowired
    private ThreadPoolExecutorProperties threadPoolExecutorProperties;

    /**
     * 线程池JavaBean
     * @return
     */
    @Bean
    public Executor scheduleTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // 配置线程池
        executor.setCorePoolSize(threadPoolExecutorProperties.getCorePoolSize());
        executor.setMaxPoolSize(threadPoolExecutorProperties.getMaxPoolSize());
        executor.setQueueCapacity(threadPoolExecutorProperties.getQueueCapacity());
        executor.setKeepAliveSeconds(threadPoolExecutorProperties.getKeepAliveSeconds());
        executor.setAllowCoreThreadTimeOut(threadPoolExecutorProperties.isAllowCoreThreadTimeOut());
        executor.setRejectedExecutionHandler(threadPoolExecutorProperties.getRejectedExecutionHandler());
        executor.setThreadNamePrefix(threadPoolExecutorProperties.getThreadNamePrefix());
        // 初始化
        executor.initialize();

        return executor;
    }
}
