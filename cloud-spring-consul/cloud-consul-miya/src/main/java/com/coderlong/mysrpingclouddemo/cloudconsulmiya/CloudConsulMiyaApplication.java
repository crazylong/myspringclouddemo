package com.coderlong.mysrpingclouddemo.cloudconsulmiya;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor Long Qiong
 * @create 2017/9/5
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CloudConsulMiyaApplication {
    @RequestMapping("/hi")
    public String home() {
        return "hi ,i'm miya";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(CloudConsulMiyaApplication.class).web(true).run(args);
    }
}
