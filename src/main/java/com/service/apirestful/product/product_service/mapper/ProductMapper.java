package com.service.apirestful.product.product_service.mapper;

import com.service.apirestful.product.product_service.model.dto.ProductResponse;
import com.service.apirestful.product.product_service.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",  uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mapping(target = "status", expression = "java(mapStatus(product))")
    ProductResponse toProductResponse(Product product);

    default String mapStatus(Product product){
        return product.getStatus() ? "Active" : "Inactive";
    }
}
