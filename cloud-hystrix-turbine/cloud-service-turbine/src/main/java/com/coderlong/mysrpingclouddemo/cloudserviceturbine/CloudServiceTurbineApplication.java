package com.coderlong.mysrpingclouddemo.cloudserviceturbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @autor Long Qiong
 * @create 2017/9/4
 */
@SpringBootApplication
@EnableTurbine
public class CloudServiceTurbineApplication {
    public static void main(String[] args) {

        new SpringApplicationBuilder(CloudServiceTurbineApplication.class).web(true).run(args);
    }
}
