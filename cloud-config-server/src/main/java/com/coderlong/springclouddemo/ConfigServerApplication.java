package com.coderlong.springclouddemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @autor Long Qiong
 * @create 2017/8/11
 */
@SpringBootApplication
//@EnableAutoConfiguration
//@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication {

    /**静态文件服务地址*/
    @Value("${server.port}")
    private String mySqlUrl;

    public static void main(String[] args) {

        SpringApplication.run(ConfigServerApplication.class, args);
        new ConfigServerApplication().test01();
    }

    private void test01(){
        //DevToolsPropertyDefaultsPostProcessor
        System.out.println(mySqlUrl);
    }
}
