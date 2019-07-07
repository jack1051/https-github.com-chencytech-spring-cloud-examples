package com.chaytech.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 21:11
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
