package com.example.demoAT.service.impl;

import com.example.demoAT.entity.Category;
import com.example.demoAT.repository.CategoryRepository;
import com.example.demoAT.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category updateCategory(Long id, Category category) {
        Category exitstingCategory = categoryRepository.findById(id).orElse(null);
        if(exitstingCategory != null) {
            exitstingCategory.setCateName(category.getCateName());
            exitstingCategory.setCateCode(category.getCateCode());

            return categoryRepository.save(exitstingCategory);
        } else {
            return null;
        }
    }
}
