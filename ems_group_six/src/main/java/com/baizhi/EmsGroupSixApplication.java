package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author superz
 */
@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class EmsGroupSixApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmsGroupSixApplication.class, args);
    }

}
