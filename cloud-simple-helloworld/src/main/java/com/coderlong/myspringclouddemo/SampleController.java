package com.coderlong.myspringclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @autor Long Qiong
 * @create 2017/8/10
 */

@Controller
@SpringBootApplication
public class SampleController {
    @ResponseBody
    @RequestMapping(value = "/")
    String home(){
        return "Hello World";
    }

    public static void main(String[] args) throws Exception {
        //spring boot封装所有配置信息为键值类型，你想改变默认配置，只需要向应用传入这个键值对就可以，比如我们想改变绑定端口为8081，那么你在main方法里传入“—server.port=8081”即可，或者干脆使用：　SpringApplication.run(SampleController.class, "--server.port=8081");
        //SpringApplication.run(SampleController.class, args);
        SpringApplication.run(SampleController.class, "--server.port=8082");
    }
}

