package com.example.demoAT.service.impl;

import com.example.demoAT.entity.Brand;
import com.example.demoAT.repository.BrandRepository;
import com.example.demoAT.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> getAllBrand() {
        return  brandRepository.findAll();
    }

    @Override
    public Brand getBrandById(Integer id) {
        return brandRepository.findById(id).orElse(null);
    }

    @Override
    public Brand saveBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(Integer id) {
        brandRepository.deleteById(id);
    }

    @Override
    public Brand updateBrand(Integer id, Brand brand) {
        Brand existingBrand = brandRepository.findById(id).orElse(null);
        if(existingBrand!=null) {
            existingBrand.setBrandName(brand.getBrandName());
            return brandRepository.save(existingBrand);
        } else {
            return null;
        }
    }
}
