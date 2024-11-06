package com.service.apirestful.product.product_service.service;

import com.service.apirestful.product.product_service.model.dto.CreateProductRequest;
import com.service.apirestful.product.product_service.model.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse findById(Long id);
    List<ProductResponse> findAll();
    List<ProductResponse> findAllByCategoryId(Long categoryId);
    ProductResponse save(CreateProductRequest request);
    ProductResponse update(Long id, CreateProductRequest request);
    void deleteById(Long id);
}
