package com.example.demoAT.service.impl;

import com.example.demoAT.entity.Product;
import com.example.demoAT.entity.Status;
import com.example.demoAT.entity.SubCategory;
import com.example.demoAT.model.request.AddProductRequest;
import com.example.demoAT.model.request.UpdateProductRequest;
import com.example.demoAT.model.response.ProductDetailResponse;
import com.example.demoAT.model.response.ProductResponse;
import com.example.demoAT.repository.ProductBrandRepository;
import com.example.demoAT.repository.ProductRepository;
import com.example.demoAT.repository.StatusRepository;
import com.example.demoAT.repository.SubCategoryRepository;
import com.example.demoAT.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Autowired
    private ProductBrandRepository productBrandRepository;

    @Override
    public List<ProductResponse> getAllProduct() {
        return  productRepository.findAllProduct();
    }

    @Override
    public ProductResponse getProductById(Long id) {
        return productRepository.findProductById(id);
    }


    @Override
    public AddProductRequest saveProduct(AddProductRequest addProductRequest) {
        Product product = new Product();
        product.setProductName(addProductRequest.getProductName());
        product.setColor(addProductRequest.getColor());
        product.setQuantity(addProductRequest.getQuantity());
        product.setOriginPrice(addProductRequest.getOriginPrice());
        product.setSellPrice(addProductRequest.getSellPrice());
        product.setDescription(addProductRequest.getDescription());
        Optional<Status> optionalStatus = statusRepository.findById(addProductRequest.getStatusId());
        product.setStatus(optionalStatus.get());
        Optional<SubCategory> optionalSubCategory = subCategoryRepository.findById(addProductRequest.getSubCateId());
        product.setSubCategory(optionalSubCategory.get());
        productRepository.save(product);
        return addProductRequest;
    }

    @Override
    public String deleteProduct(Long id) {
        Optional<Product> checkProd = productRepository.findById(id);
        if (checkProd.isEmpty()) {
            return "Product không tồn tại";
        }
        productBrandRepository.deleteByProduct(checkProd.get());
        productRepository.deleteById(id);
        return "Đã xóa thành công Product";
    }

    @Override
    public String updateProduct(Long id, UpdateProductRequest updateProductRequest) {
        Optional<Product> optionalExistingProduct = productRepository.findById(id);
        if (optionalExistingProduct.isPresent()) {
            Product existingProduct = optionalExistingProduct.get();

            // update product từ request
            existingProduct.setProductName(updateProductRequest.getProductName());
            existingProduct.setColor(updateProductRequest.getColor());
            existingProduct.setQuantity(updateProductRequest.getQuantity());
            existingProduct.setSellPrice(updateProductRequest.getSellPrice());
            existingProduct.setOriginPrice(updateProductRequest.getOriginPrice());
            existingProduct.setDescription(updateProductRequest.getDescription());


            Optional<SubCategory> subCategoryOptional = subCategoryRepository.findById(updateProductRequest.getSubCateId());
            if (subCategoryOptional.isPresent()) {
                SubCategory subCategory = subCategoryOptional.get();
                existingProduct.setSubCategory(subCategory);
            } else {
                return "SubCategory not found with ID: " + updateProductRequest.getSubCateId();
            }

            Optional<Status> statusOptional = statusRepository.findById(updateProductRequest.getStatusId());
            if (statusOptional.isPresent()) {
                Status status = statusOptional.get();
                existingProduct.setStatus(status);
            } else {
                return "Status not found with ID: " + updateProductRequest.getStatusId();
            }

            productRepository.save(existingProduct);

            return "Product updated successfully!";
        } else {
            return "Product not found with ID: " + id;
        }
    }




}
