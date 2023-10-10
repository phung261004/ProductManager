package com.example.demoAT.controller;

import com.example.demoAT.entity.Brand;
import com.example.demoAT.service.impl.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandController {

    @Autowired
    private BrandServiceImpl brandServiceImpl;

    @GetMapping("")
    public List<Brand> getAllBrand() {
        return brandServiceImpl.getAllBrand();
    }

    @GetMapping("/{id}")
    public Brand getBrandById(@PathVariable Long id) {
        return brandServiceImpl.getBrandById(id);
    }


}
