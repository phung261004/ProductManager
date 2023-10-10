package com.example.demoAT.service;

import com.example.demoAT.entity.SubCategory;

import java.util.List;

public interface SubCategoryService {
    List<SubCategory> getAllSubcategories();

    SubCategory getSubcategoryById(Long id);


}
