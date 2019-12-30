package com.zj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@MapperScan("com.zj.dao.ClientExcelDao")
@SpringBootApplication
@EnableScheduling
public class MucBigGroupApplication {

    public static void main(String[] args) {
        SpringApplication.run(MucBigGroupApplication.class, args);
    }

}
