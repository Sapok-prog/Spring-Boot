package com.example.practice1;

import org.springframework.web.bind.annotation.*;


@RestController
public class helloWorld {

    @GetMapping("/get/helloWorld")
    public String getHelloWorld(@RequestBody String name){
        return "Hello world! " + name;
    }
}
