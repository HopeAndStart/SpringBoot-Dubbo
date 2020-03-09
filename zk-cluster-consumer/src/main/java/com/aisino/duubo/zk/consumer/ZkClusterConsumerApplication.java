package com.aisino.duubo.zk.consumer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = {"com.aisino.dubbo.zk.consuer"})
public class ZkClusterConsumerApplication {

    public static void main (String[] args) {
        SpringApplication.run(ZkClusterConsumerApplication.class, args);
    }

}
