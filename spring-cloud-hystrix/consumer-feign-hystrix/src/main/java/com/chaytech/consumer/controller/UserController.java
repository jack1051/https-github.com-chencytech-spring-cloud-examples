package com.chaytech.consumer.controller;

import com.chaytech.api.user.UserApi;
import com.chaytech.model.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 21:12
 */
@RestController
public class UserController {

    @Autowired
    private UserApi userApi;

    @PostMapping("/consumer/user/add")
    public boolean add(UserEntity user) {
        return userApi.createUser(user);
    }

    @GetMapping("/consumer/user/getUser/{id}")
    public UserEntity get(@PathVariable("id") Integer id) {
        return userApi.getUser(id);
    }

    @GetMapping("/consumer/user/listUser")
    public List<UserEntity> list() {
        return userApi.listUser();
    }
}
