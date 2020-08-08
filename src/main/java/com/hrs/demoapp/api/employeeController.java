package com.hrs.demoapp.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

    @RequestMapping(value = "/hello")
    public String helloWorld() {
        return "hello";
    }
}
