package com.zookeeper.dubbo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zookeeper.dubbo.consumer.service.DubboConsumerService;

@RestController
public class DubboConsumerController {
    
    @Autowired
    private DubboConsumerService consumerService;
    
    @GetMapping("/consumer")
    public String dubbo(){
        return consumerService.invoke("dubbo-consumer");
    }

}
