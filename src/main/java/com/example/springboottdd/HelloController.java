package com.example.springboottdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/")
    public String getLoginUsers(Principal principal){
        System.out.println(principal.getName());

        return principal.toString();
    }

}
