package com.coderlong.mysrpingclouddemo.cloudeurekaservice6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @autor Long Qiong
 * @create 2017/8/30
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudEurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServiceApplication.class, args);
    }
}
