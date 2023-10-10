package com.example.demoAT.service;

import com.example.demoAT.entity.Category;

import java.util.List;


public interface CategoryService {
    List<Category> getAllCategory();

    Category getCategoryById(Long id);

    Category saveCategory(Category category);

    void deleteCategory(Long id);

    Category updateCategory(Long id, Category category);
}
