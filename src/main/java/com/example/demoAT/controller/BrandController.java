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
    public Brand getBrandById(@PathVariable Integer id) {
        return brandServiceImpl.getBrandById(id);
    }

    @PostMapping("/")
    public Brand createBrand(@RequestBody Brand brand) {
        return brandServiceImpl.saveBrand(brand);
    }

    @DeleteMapping("/{id}")
    public void deleteBrand(@PathVariable Integer id) {
        brandServiceImpl.deleteBrand(id);
    }

    @PutMapping("/{id}")
    public Brand updateBrand(@PathVariable Integer id, @RequestBody Brand brand) {
        return  brandServiceImpl.updateBrand(id, brand);
    }

}
