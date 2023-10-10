package com.example.demoAT.service;

import com.example.demoAT.entity.Product;
import com.example.demoAT.model.request.AddProductRequest;
import com.example.demoAT.model.request.UpdateProductRequest;
import com.example.demoAT.model.response.ProductDetailResponse;
import com.example.demoAT.model.response.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProduct();

    ProductResponse getProductById(Long id);

    AddProductRequest saveProduct(AddProductRequest addProductRequest);

    String deleteProduct(Long id);

    String updateProduct(Long id, UpdateProductRequest updateProductRequest);

}
