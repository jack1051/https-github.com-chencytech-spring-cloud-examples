package com.chaytech.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author chaytech@163.com
 * @date 2019/07/31 21:21
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServer_Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServer_Application.class, args);
    }
}
