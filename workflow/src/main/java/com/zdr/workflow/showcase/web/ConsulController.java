package com.zdr.workflow.showcase.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@Slf4j
@RestController
@Api(value = "ConsulController")
public class ConsulController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有的服务
     * @return
     */
    @RequestMapping("services")
    @ApiOperation(value = "获取Consul所有Service", notes = "获取Consul所有Service")
    public Object getServices(){

//        List<ServiceInstance> instances = discoveryClient.getInstances("consul");
//        System.out.println(instances.toString());
        List<String> services = discoveryClient.getServices();
        log.info("All services:{}",services);
        return services;
    }

    /**
     * 轮训获取服务中的其中一个
     * @return
     */
    @RequestMapping("discover")
    @ApiOperation(value = "获取Consul discover", notes = "获取Consul discover")
    public String discover(){

        return loadBalancerClient.choose("consul-producer").toString();
    }
}
