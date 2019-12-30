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
    @Scheduled(cron = "0 0/2 0 1-3 * ? ") //两分钟
    public void scheduledCron() {
        //拉人

    }



    /**
     * 定时任务2
     */
    @Scheduled(cron = "0 0 0 1-3 * ? ") //每天执行一次
    public void scheduledCron2() {
        // 更改群名

    }

//    @Scheduled(cron = "0 0/5 * * * ? *") //两分钟
//    public void scheduledCron3() {
//        // 减人
//
//    }
}
