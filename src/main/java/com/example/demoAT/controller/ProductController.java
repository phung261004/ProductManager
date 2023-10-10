package com.example.demoAT.controller;

import com.example.demoAT.entity.Product;
import com.example.demoAT.model.request.AddProductRequest;
import com.example.demoAT.model.request.UpdateProductRequest;
import com.example.demoAT.model.response.ProductResponse;
import com.example.demoAT.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("")
    public ResponseEntity<?> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {
        return  new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }

    @PostMapping("/add_product")
    public ResponseEntity<?> createProduct(@RequestBody AddProductRequest addProductRequest){
        return new ResponseEntity<>(productService.saveProduct(addProductRequest), HttpStatus.CREATED);
    }

    @PutMapping("/update_product/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody UpdateProductRequest updateProductRequest) {
        return new ResponseEntity<>(productService.updateProduct(id, updateProductRequest), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return productService.deleteProduct(id);
    }

}
