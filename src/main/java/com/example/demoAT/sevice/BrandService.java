package com.example.demoAT.sevice;

import com.example.demoAT.entity.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAllBrand();
    Brand getBrandById(Integer id);

    Brand saveBrand(Brand brand);

    void deleteBrand(Integer id);

    Brand updateBrand(Integer id, Brand brand);

}
