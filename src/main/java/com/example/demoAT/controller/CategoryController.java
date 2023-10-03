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
    public Category getCategoryById(@PathVariable Integer id) {
        return categoryServiceImpl.getCategoryById(id);
    }

    @PostMapping("/")
    public Category createCategory(@RequestBody Category category) {
        return categoryServiceImpl.saveCategory(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Integer id, @RequestBody Category category) {
        return categoryServiceImpl.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Integer id)  {
         categoryServiceImpl.deleteCategory(id);
    }
}
