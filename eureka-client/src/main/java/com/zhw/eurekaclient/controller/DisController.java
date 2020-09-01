package com.zhw.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghongwei
 * @since 2020/9/1
 */

@RestController
public class DisController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Value("${server.port}")
    String port;

    @GetMapping("/dc")
    public String dc() {
        System.out.println("port:" + port);
        String services = port + ",Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
