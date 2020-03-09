package com.aisino.dubbo.zk.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = {"com.aisino.dubbo.zk.provider.service"})
public class ZkClusterProviderApplication {

    public static void main (String[] args) {
        SpringApplication.run(ZkClusterProviderApplication.class, args);
    }

}
