package com.chaytech.consumer.config;

import com.chaytech.ribbonrule.CustomRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chaytech@163.com
 * @date 2019/07/22 21:36
 */
@Configuration
public class RibbonRuleConfig {

    // 指定ribbon负载均衡规则
    @Bean
    public IRule ribbonRule(){
        return new RandomRule(); // 先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
    }
}
