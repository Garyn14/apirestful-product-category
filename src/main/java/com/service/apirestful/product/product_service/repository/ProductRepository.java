package com.service.apirestful.product.product_service.repository;

import com.service.apirestful.product.product_service.model.entity.Category;
import com.service.apirestful.product.product_service.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory(Category category);
}
