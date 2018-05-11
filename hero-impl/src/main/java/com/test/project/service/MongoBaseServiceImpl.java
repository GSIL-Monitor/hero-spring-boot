package com.test.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * mongo实现
 *
 * @author hezun
 */
public class MongoBaseServiceImpl implements MongoBaseService {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public MongoBaseServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }
}
