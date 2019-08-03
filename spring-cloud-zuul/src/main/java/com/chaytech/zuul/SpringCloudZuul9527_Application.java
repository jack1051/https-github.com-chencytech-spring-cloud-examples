package com.chaytech.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author chaytech@163.com
 * @date 2019/08/03 21:18
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuul9527_Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuul9527_Application.class,args);
    }
}
