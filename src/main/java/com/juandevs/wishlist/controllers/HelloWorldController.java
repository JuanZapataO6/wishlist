package com.juandevs.wishlist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/sayhi")
public class HelloWorldController {

@GetMapping("hello")
    public String sayHi ()
    {
        return ("Hello World Comfandi");
    }
}
