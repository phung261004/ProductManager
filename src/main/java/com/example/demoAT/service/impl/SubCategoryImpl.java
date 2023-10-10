package com.example.demoAT.service.impl;

import com.example.demoAT.entity.SubCategory;
import com.example.demoAT.repository.SubCategoryRepository;
import com.example.demoAT.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryImpl implements SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;
    public List<SubCategory> getAllSubcategories() {
        return subCategoryRepository.findAll();
    }

    public SubCategory getSubcategoryById(Long id) {
        return subCategoryRepository.findById(id).orElse(null);
    }

}
