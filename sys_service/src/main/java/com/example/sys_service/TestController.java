package com.example.sys_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhou yao
 * @date 2024/5/6
 * @desc
 **/
@RestController
public class TestController {

    @Value("${app.user.name:default}")
    private String name;


    @GetMapping("/hello")
    public String hello() {
        return "hello " + name;
    }

}
