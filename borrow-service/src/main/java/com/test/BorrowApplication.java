package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 借书 启动类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 17:45
 */
@EnableFeignClients
@SpringBootApplication
public class BorrowApplication {

    public static void main(String[] args) {
        SpringApplication.run(BorrowApplication.class, args);
    }

}
