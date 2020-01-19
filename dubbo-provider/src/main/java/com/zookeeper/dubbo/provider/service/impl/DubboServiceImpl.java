package com.zookeeper.dubbo.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.zookeeper.dubbo.api.DubboServiceI;

@Service
public class DubboServiceImpl implements DubboServiceI {

    @Override
    public String sayHello(String name) {
        return String.format("%s, Say hello to dubbo.", name);
    }

}
