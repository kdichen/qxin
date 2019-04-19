package com.qian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : ChenQian
 * @date : 2019/4/19 21:57
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.qian"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
