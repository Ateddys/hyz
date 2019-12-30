package com.zj.job;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author : hyz
 * @program : onecode
 * @description :   定时任务
 * @date : 2019-12-30 09:32
 **/
@Component
@EnableScheduling
public class GroubJob {

    /**
     * 定时任务1
     */
    @Scheduled(cron = "0/5 * * * * ?") // 每天10点执行
    public void scheduledCron() {
        // 去做事情吧
        System.out.println("来了1");
    }


    /**
     * 定时任务2
     */
    @Scheduled(cron = "0 0/2 * * * ?") // 每天10点执行
    public void scheduledCron2() {
        // 去做事情吧
        System.out.println("来了2");
    }
}
