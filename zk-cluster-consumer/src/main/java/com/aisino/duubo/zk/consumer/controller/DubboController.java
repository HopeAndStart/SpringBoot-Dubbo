package com.aisino.duubo.zk.consumer.controller;

import com.aisino.dubbo.zk.service.DubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zsl
 * @version 1.0.0
 * @date: 2020/3/9 17:30
 **/
@RestController
public class DubboController {

    @Reference
    private DubboService dubboService;
    
    @GetMapping("/dubboProtocol/{message}")
    public String dubboProtocol(@PathVariable("message") String message){
        String s = dubboService.dubboProtocolTest(message);
        return s;
    }

}
