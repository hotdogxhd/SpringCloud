package com.xhd.login2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class LoginController {
    @GetMapping("login")
    public String login(){
        String uuid = UUID.randomUUID().toString();
        return uuid+"集群2";
    }
}
