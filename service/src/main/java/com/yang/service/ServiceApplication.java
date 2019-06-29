package com.yang.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 由于mapper在dao.jar包中，此处必须指定mapper类路径
 */
@SpringBootApplication
@MapperScan("com.yang.dao.mapper")
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
