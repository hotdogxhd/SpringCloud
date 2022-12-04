package com.example.customerservice.feign;

import com.example.customerservice.feign.hystrix.CustomerDoCarFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "car-service",fallback = CustomerDoCarFeignImpl.class )
public interface CustomerDoCarFeign {

    @GetMapping("car")
    public String car();
}
