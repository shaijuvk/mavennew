package com.DevOps.RestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    @GetMapping("/test")
    public String display(){
        return "This is test API";
    }

}
