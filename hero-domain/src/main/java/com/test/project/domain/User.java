package com.test.project.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

/**
 * user用例
 *
 * @author hezun
 */
@EntityScan
public class User {

    @Id
    private String id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, name='%s', age='%s']",
                id, name, age);
    }
}
