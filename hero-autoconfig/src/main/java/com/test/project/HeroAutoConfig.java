package com.test.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.project.service.HelloWorldService;
import com.test.project.service.HelloWorldServiceImpl;

/**
 * TODO 类描述
 *
 * @author hezun
 */
@Configuration
public class HeroAutoConfig {

    @Bean
    public HelloWorldService myHelloService() {
        return new HelloWorldServiceImpl();
    }
}
