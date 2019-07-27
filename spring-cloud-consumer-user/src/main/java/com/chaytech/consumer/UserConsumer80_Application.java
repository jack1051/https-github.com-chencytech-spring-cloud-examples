package com.chaytech.consumer;

import com.chaytech.consumer.config.RibbonRuleConfig;
import com.chaytech.ribbonrule.CustomRule;
import com.chaytech.ribbonrule.CustomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:58
 */
@SpringBootApplication
// 本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
@RibbonClient(name = "USER-PROVIDER", configuration = CustomRuleConfig.class)
public class UserConsumer80_Application {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumer80_Application.class,args);
    }
}
