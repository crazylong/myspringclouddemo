package com.coderlong.mysrpingclouddemo.cloudservicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @autor Long Qiong
 * @create 2017/8/21
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudServiceFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudServiceFeignApplication.class, args);
    }
}
