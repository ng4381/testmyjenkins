package com.example.testjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/test")
public class Mycontroller {
    @GetMapping
    public String test() {
        return "NIKITA";
    }
}
