package com.chaytech.provider.user.controller;

import com.chaytech.provider.user.service.IUserService;
import com.chaytech.model.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User-controller
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:52
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/user/createUser")
    public boolean createUser(@RequestBody  UserEntity user){
        return userService.createUser(user);
    }

    @GetMapping("/user/getUser/{id}")
    public UserEntity getUser(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }

    @GetMapping("/user/listUser")
    public List<UserEntity> listUser(){
        return userService.listUser();
    }


    @GetMapping("/user/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("USER-PROVIDER");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
