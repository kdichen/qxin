package com.qian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author : ChenQian
 * @date : 2019/4/19 21:57
 */
@SpringBootApplication
@MapperScan(basePackages = "com.qian.mapper")
@ComponentScan(basePackages = {"com.qian", "org.n3r.idworker"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
