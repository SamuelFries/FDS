package com.fries.ex1_biblioteca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
    @GetMapping
    public String hello() {
        return "Hello, World!";
    }
}
