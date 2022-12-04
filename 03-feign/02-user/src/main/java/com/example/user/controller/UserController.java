package com.example.user.controller;


import com.example.user.feign.MyFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    public MyFeign myFeign;

    @GetMapping("userDoOrder")
    public String userDoOrder(){
        String order = myFeign.order();
        return order;
    }
}
