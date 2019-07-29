package com.chaytech.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:58
 */
@SpringBootApplication
// 本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
@EnableFeignClients(basePackages ={"com.chaytech.**"} )
@ComponentScan(basePackages = {"com.chaytech.**"})
@EnableHystrix // 开启hysterix
public class UserConsumerHystrix80_Application {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerHystrix80_Application.class,args);
    }
}
