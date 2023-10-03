package com.example.demoAT.service.impl;

import com.example.demoAT.entity.Product;
import com.example.demoAT.repository.ProductRepository;
import com.example.demoAT.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> getAllProduct() {
        return  productRepository.findAll();
    }

    @Override
    public Product getProductBtId(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product updateProduct(Integer id, Product product) {
        Optional<Product> optionalExistingProduct = productRepository.findById(id);
        if (optionalExistingProduct.isPresent()) {
            Product existingProduct = optionalExistingProduct.get();
            existingProduct.setProductName(product.getProductName());
            existingProduct.setColor(product.getColor());
            existingProduct.setQuantity(product.getQuantity());
            existingProduct.setSellPrice(product.getSellPrice());
            existingProduct.setOriginPrice(product.getOriginPrice());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setSubCategory(product.getSubCategory());
            existingProduct.setStatus(product.getStatus());
            return productRepository.save(existingProduct);
        } else {
            return null;
        }
    }
}
