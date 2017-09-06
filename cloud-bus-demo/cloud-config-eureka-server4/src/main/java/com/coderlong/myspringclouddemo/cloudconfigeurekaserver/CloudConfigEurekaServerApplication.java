package com.coderlong.myspringclouddemo.cloudconfigeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @autor Long Qiong
 * @create 2017/8/22
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudConfigEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigEurekaServerApplication.class, args);
    }
}
