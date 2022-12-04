package com.xhd.gatewayroute.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class MyGlobalFilter implements GlobalFilter , Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        String path = request.getURI().getPath();
        System.out.println(path);
        HttpHeaders headers = request.getHeaders();
        System.out.println(headers);
        HttpMethod method = request.getMethod();
        System.out.println(method);
        String hostName = request.getRemoteAddress().getHostName();
        System.out.println(hostName);
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
