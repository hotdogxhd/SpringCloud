package com.xhd.carservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("car")
    public String car(){
        return "调用了car的car方法";
    }
}
