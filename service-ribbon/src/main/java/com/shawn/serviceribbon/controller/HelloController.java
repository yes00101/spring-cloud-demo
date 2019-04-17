package com.shawn.serviceribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shawn.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
    @RequestMapping("/index")
    public String index(){
        return "hello";
    }
}
