package com.service.apirestful.product.product_service.service;

import com.service.apirestful.product.product_service.model.dto.CreateProductRequest;
import com.service.apirestful.product.product_service.model.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public ProductResponse findById(Long id) {
        return null;
    }

    @Override
    public List<ProductResponse> findAll() {
        return null;
    }

    @Override
    public List<ProductResponse> findAllByCategoryId(Long categoryId) {
        return null;
    }

    @Override
    public ProductResponse save(CreateProductRequest request) {
        return null;
    }

    @Override
    public ProductResponse update(Long id, CreateProductRequest request) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
