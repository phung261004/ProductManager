package com.example.demoAT.sevice;

import com.example.demoAT.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProduct();

    Product getProductBtId(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

    Product updateProduct(Integer id, Product product);

}
