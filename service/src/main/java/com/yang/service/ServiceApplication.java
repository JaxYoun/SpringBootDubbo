package com.yang.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//此处给注解添加排除属性，为了解决postgresql驱动导致的启动失败问题
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
