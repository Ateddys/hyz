package com.zj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zj.dao.ClientExcelDao")
@SpringBootApplication
public class MucBigGroupApplication {

    public static void main(String[] args) {
        SpringApplication.run(MucBigGroupApplication.class, args);
    }

}
