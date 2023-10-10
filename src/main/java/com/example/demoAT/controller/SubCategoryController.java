package com.example.demoAT.controller;

import com.example.demoAT.entity.SubCategory;
import com.example.demoAT.service.impl.SubCategoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subcategories")
public class SubCategoryController {

    @Autowired
    private SubCategoryImpl subCategoryImpl;

    @GetMapping()
    public List<SubCategory> getAllSubcategories() {
        return subCategoryImpl.getAllSubcategories();
    }

    @GetMapping("/{id}")
    public SubCategory getSubcategoryById(@PathVariable Long id) {
        return subCategoryImpl.getSubcategoryById(id);
    }

}
