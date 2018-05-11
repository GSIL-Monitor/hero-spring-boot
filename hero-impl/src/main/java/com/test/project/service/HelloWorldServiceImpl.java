package com.test.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.test.project.dao.mongo.UserMongoRepository;
import com.test.project.domain.User;

/**
 * hello实现
 *
 * @author hezun
 */

public class HelloWorldServiceImpl implements HelloWorldService {

    @Value("${name.world}")
    private String name;

    @Autowired
    private UserMongoRepository userMongoRepository;

    public void saveUser() {
        User user = new User();
        this.userMongoRepository.save(user);
    }
}
