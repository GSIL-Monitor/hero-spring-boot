package com.test.project.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.project.service.HelloWorldService;

/**
 * TODO 类描述
 *
 * @author hezun
 */
@Controller
public class HelloController {

    @Autowired
    private HelloWorldService myHelloService;

    @RequestMapping("/")
    @ResponseBody
    public void helloWorld() { this.myHelloService.saveUser();
    }
}
