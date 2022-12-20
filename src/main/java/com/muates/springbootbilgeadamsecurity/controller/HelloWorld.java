package com.muates.springbootbilgeadamsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping("/send")
    public String hello() {
        return "Hello Murat";
    }

    @GetMapping("/book")
    public String book() {
        return "Hello Book";
    }

    @GetMapping("/car")
    public String car() {
        return "Hello Car";
    }
}
