package com.example.demoAT.controller;

import com.example.demoAT.entity.Product;
import com.example.demoAT.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProduct();
    }
}
