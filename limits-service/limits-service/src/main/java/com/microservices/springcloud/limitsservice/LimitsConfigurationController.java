package com.microservices.springcloud.limitsservice;

import com.microservices.springcloud.limitsservice.beans.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromBeans(){
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());


    }
}
