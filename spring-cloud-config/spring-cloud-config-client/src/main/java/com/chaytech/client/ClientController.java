package com.chaytech.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chaytech@163.com
 * @date 2019/07/31 22:25
 */
@RestController
public class ClientController {

    @Value("${profiles}")
    private String profiles;

    @GetMapping("/profiles")
    public String profiles() {
        return this.profiles;
    }
}
