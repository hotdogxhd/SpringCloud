package com.example.user.feign;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "order-service")
public interface MyFeign {
    @GetMapping("order")
     String order();

}
