package com.xhd.consumer.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("consumerTest")
    public String consumerTest(String servicerName){
        String forObject = restTemplate.getForObject("http://" + servicerName + "/providerTest", String.class);
        return forObject;
    }
}
