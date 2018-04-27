package com.test.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO 类描述
 *
 * @author hezun
 */
@SpringBootApplication
public class HeroApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HeroApplication.class);
        app.run(args);
    }
}
