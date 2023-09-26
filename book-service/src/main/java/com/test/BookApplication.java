package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 书籍 启动类
 *
 * @Author YouZhi
 * @Date 2023 - 09 - 26 - 17:43
 */
@MapperScan("com.test.mapper")
@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }

}
