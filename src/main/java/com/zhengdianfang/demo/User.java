package com.zhengdianfang.demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
@Component
public class User {

    @Value("${username}")
    private String username;

    @Value("${age}")
    private int age;

    @Value("${age}")
    private String address;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }
}
