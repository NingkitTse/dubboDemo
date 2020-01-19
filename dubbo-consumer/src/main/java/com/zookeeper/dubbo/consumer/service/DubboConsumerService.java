package com.zookeeper.dubbo.consumer.service;

public interface DubboConsumerService {

    /**
     * invoke provider service
     * 
     * @param name
     * @return
     */
    String invoke(String name);
}
