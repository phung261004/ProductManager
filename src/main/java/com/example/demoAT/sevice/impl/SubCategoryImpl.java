package com.example.demoAT.sevice.impl;

import com.example.demoAT.entity.SubCategory;
import com.example.demoAT.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryImpl {

    @Autowired
    private SubCategoryRepository subCategoryRepository;
    public List<SubCategory> getAllSubcategories() {
        return subCategoryRepository.findAll();
    }

    public SubCategory getSubcategoryById(Integer id) {
        return subCategoryRepository.findById(id).orElse(null);
    }

    public SubCategory saveSubcategory(SubCategory subcategory) {
        return subCategoryRepository.save(subcategory);
    }

    public void deleteSubcategory(Integer id) {
        subCategoryRepository.deleteById(id);
    }


}
