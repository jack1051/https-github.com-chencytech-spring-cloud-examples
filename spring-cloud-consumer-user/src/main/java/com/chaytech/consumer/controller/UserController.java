package com.chaytech.consumer.controller;

import com.chaytech.model.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 21:12
 */
@RestController
public class UserController {

    // private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
    private static final String REST_URL_PREFIX = "http://USER-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/user/add")
    public boolean add(UserEntity user) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/user/createUser", user, Boolean.class);
    }

    @GetMapping("/consumer/user/getUser/{id}")
    public UserEntity get(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/getUser/" + id, UserEntity.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/consumer/user/listUser")
    public List<UserEntity> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/listUser", List.class);
    }

    @GetMapping("/consumer/user/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/discovery", Object.class);
    }
}
