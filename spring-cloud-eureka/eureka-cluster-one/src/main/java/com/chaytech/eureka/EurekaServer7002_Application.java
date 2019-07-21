package com.chaytech.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 21:31
 */
@SpringBootApplication
// EurekaServer服务器端启动类,接受其它微服务注册进来
@EnableEurekaServer
public class EurekaServer7002_Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_Application.class, args);
    }
}
