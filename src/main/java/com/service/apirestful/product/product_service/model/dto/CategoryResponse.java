package com.service.apirestful.product.product_service.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

@Getter @Builder
@JsonInclude(JsonInclude.Include.NON_NULL) // if some properties are null, they will not be displayed
public class CategoryResponse {
    private Long id;
    private String name;
}
