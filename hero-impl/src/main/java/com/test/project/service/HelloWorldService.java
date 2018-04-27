package com.test.project.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * TODO 类描述
 *
 * @author hezun
 */
@Service
public class HelloWorldService {

    @Value("${name.world}")
    private String name;

    public String getHelloMessage() {
        return "Hello " + this.name;
    }
}
