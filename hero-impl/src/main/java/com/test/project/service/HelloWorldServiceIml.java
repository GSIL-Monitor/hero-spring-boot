package com.test.project.service;

import org.springframework.beans.factory.annotation.Value;

/**
 * TODO 类描述
 *
 * @author hezun
 */

public class HelloWorldServiceIml implements HelloWorldService {

    @Value("${name.world}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }
}
