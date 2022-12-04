package com.example.customerservice.controller;

import com.example.customerservice.feign.CustomerDoCarFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomerController {

    @Resource
    private CustomerDoCarFeign customerDoCarFeign;

    @GetMapping("customer")
    public String customer(){
        String car = customerDoCarFeign.car();
        return car;
    }
}
