package com.xhd.providera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("providerTest")
    public String providerTest(){

        return "我是提供者aa的接口";


    }
}
