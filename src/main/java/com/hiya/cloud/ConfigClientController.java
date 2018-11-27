package com.hiya.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController
{
    @Value("${HiyaKey0}") // git配置文件里的key
    String HiyaKey0;

    @Value("${HiyaKey1}") // git配置文件里的key
    String HiyaKey1;
    
    @RequestMapping("/HiyaKey0")
    public String HiyaKey0()
    {
        return HiyaKey0;
    }
    
    @RequestMapping("/HiyaKey1")
    public String HiyaKey1()
    {
        return HiyaKey1;
    }
}
