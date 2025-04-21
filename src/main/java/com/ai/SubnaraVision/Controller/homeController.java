package com.ai.SubnaraVision.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    @GetMapping("/user")
    public String user(){
        return "USER";
    }
    @GetMapping("/admin")
    public String admin(){
        return "ADMIN";
    }
}
