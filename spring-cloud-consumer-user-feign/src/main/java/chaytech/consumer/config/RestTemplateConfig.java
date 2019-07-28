package chaytech.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced // 对ConfigBean进行新注解@LoadBalanced  获得Rest时加入Ribbon的配置
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
