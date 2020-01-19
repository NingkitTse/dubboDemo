package com.zookeeper.dubbo.consumer.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import com.zookeeper.dubbo.api.DubboServiceI;

@Service
public class DubboConsumerServiceImpl implements DubboConsumerService {

    @Reference(check = false)
    private DubboServiceI dubboService;

    @Override
    public String invoke(String name) {
        return dubboService.sayHello(name);
    }

}
