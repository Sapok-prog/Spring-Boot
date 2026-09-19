package com.example.practice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice2Application")
public class Practice2ApplicationController {

    private Practice2ApplicationProperties properties;

    public Practice2ApplicationController(Practice2ApplicationProperties properties){
        this.properties = properties;
    }

    @GetMapping("/get")
    public String getAppName(){
        return properties.name();
    }

}
