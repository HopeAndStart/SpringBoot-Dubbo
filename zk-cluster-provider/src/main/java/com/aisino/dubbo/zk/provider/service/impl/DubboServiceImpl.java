package com.aisino.dubbo.zk.provider.service.impl;

import com.aisino.dubbo.zk.service.DubboService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author zsl
 * @version 1.0.0
 * @date: 2020/3/9 17:04
 **/
@Service
@Component
public class DubboServiceImpl implements DubboService {
    
    @Override
    public String dubboProtocolTest (String dubboParameter) {
        return dubboParameter;
    }
    
}
