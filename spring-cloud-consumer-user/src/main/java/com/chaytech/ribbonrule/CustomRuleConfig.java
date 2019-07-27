package com.chaytech.ribbonrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chaytech@163.com
 * @date 2019/07/27 15:28
 */
@Configuration
public class CustomRuleConfig {
    // 指定ribbon负载均衡规则
    @Bean
    public IRule ribbonRule(){
        return new CustomRule(); // 先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
    }
}
