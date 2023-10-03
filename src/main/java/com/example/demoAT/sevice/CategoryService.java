package com.example.demoAT.sevice;

import com.example.demoAT.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    List<Category> getAllCategory();

    Category getCategoryById(Integer id);

    Category saveCategory(Category category);

    void deleteCategory(Integer id);

    Category updateCategory(Integer id, Category category);
}
