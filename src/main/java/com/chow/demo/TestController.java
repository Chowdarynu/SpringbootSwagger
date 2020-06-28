package com.chow.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chowdan on 07-06-2018.
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String sayHello() {
        return "hello";
    }
}
