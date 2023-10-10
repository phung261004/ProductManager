package com.example.demoAT.controller;

import com.example.demoAT.entity.Category;
import com.example.demoAT.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryServiceImpl;
    @GetMapping("")
    public List<Category> getAllCategory() {
        return categoryServiceImpl.getAllCategory();
    }
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryServiceImpl.getCategoryById(id);
    }
}
