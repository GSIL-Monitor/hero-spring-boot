package com.test.project.dao.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.project.domain.User;

/**
 * TODO 类描述
 *
 * @author hezun
 */
public interface UserMongoRepository extends MongoRepository<User, Long> {

}
