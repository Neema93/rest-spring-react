package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
public class HomeContorller{
    @GetMapping("/")
    public String home() {
            return "Hello This is Main Page";
    }
    
}