package com.chaytech.consumer.controller;

import com.chaytech.api.user.UserApi;
import com.chaytech.model.user.UserEntity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger Logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserApi userApi;

    @PostMapping("/consumer/user/add")
    public boolean add(UserEntity user) {
        return userApi.createUser(user);
    }

    @GetMapping("/consumer/user/getUser/{id}")
    public UserEntity getUser(@PathVariable("id") Integer id) {
        Logger.info("getUser thread name is {}", Thread.currentThread().getName());
        return userApi.getUser(id);
    }

    @GetMapping("/consumer/user/listUser")
    public List<UserEntity> list() {
        return userApi.listUser();
    }

    @GetMapping("/consumer/user/getUserHystrix/{id}")
    // 一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "userHystrixFallback")
    public UserEntity getUserHystrix(@PathVariable("id") Integer id) {
        Logger.info("getUserHystrix thread name is {}", Thread.currentThread().getName());
        return userApi.getUser(id);
    }

    /**
     * 熔断降级回退方法
     *
     * 注意此方法返回值和参数需与目标方式一致
     *
     * @param id
     * @return
     */
    private UserEntity userHystrixFallback(Integer id){
        UserEntity userEntity = new UserEntity("系统繁忙，请稍后再试！");
        return userEntity;
    }
}
