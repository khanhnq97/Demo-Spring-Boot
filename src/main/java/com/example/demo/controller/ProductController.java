package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Products")
public class ProductController {
    @GetMapping("")
        //This request is: http://localhost:8080/api/v1/Products
    List<String> getAllProducts() {
        return List.of("iphone", "ipad");
    }
}
