package com.example.demoAT.repository;

import com.example.demoAT.entity.Product;
import com.example.demoAT.entity.ProductBrand;
import com.example.demoAT.entity.ProductBrandPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductBrandRepository extends JpaRepository<ProductBrand, ProductBrandPK> {
    void deleteByProduct(Product product);
}
