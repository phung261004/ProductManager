package com.example.demoAT.service;

import com.example.demoAT.entity.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAllBrand();
    Brand getBrandById(Long id);


}
