package com.coderlong.mysrpingclouddemo.cloudservicezipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @autor Long Qiong
 * @create 2017/8/25
 */
@SpringBootApplication
@EnableZipkinServer
public class CloudServiceZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudServiceZipkinApplication.class, args);
    }
}
