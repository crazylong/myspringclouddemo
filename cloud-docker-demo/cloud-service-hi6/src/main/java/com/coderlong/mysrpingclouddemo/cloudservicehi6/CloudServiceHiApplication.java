package com.coderlong.mysrpingclouddemo.cloudservicehi6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor Long Qiong
 * @create 2017/8/30
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudServiceHiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudServiceHiApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
