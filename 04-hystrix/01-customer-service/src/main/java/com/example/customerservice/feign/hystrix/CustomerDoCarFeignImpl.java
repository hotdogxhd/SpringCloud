package com.example.customerservice.feign.hystrix;

import com.example.customerservice.feign.CustomerDoCarFeign;
import org.springframework.stereotype.Component;

@Component
public class CustomerDoCarFeignImpl implements CustomerDoCarFeign {
    @Override
    public String car() {
        return "宕机执行的方法";
    }
}
