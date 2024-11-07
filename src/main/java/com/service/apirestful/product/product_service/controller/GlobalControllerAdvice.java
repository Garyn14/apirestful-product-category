package com.service.apirestful.product.product_service.controller;

import com.service.apirestful.product.product_service.exception.CategoryNotFoundException;
import com.service.apirestful.product.product_service.exception.ProductNotFoundException;
import com.service.apirestful.product.product_service.model.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Collections;

import static com.service.apirestful.product.product_service.util.ErrorCatalog.*;

@RestControllerAdvice
public class GlobalControllerAdvice {
    // starts with particular error to generic errors (particular -> generic)

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProductNotFoundException.class)
    public ErrorResponse handleProductNotFoundException(){
        return ErrorResponse.builder()
                .code(PRODUCT_NOT_FOUND.getCode())
                .status(HttpStatus.NOT_FOUND)
                .message(PRODUCT_NOT_FOUND.getMessage())
                .timeStamp(LocalDateTime.now())
                .build();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CategoryNotFoundException.class)
    public ErrorResponse handleCategoryNotFoundException(){
        return ErrorResponse.builder()
                .code(CATEGORY_NOT_FOUND.getCode())
                .status(HttpStatus.NOT_FOUND)
                .message(CATEGORY_NOT_FOUND.getMessage())
                .timeStamp(LocalDateTime.now())
                .build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {

        BindingResult result = exception.getBindingResult();

        return ErrorResponse.builder()
                .code(INVALID_PRODUCT.getCode())
                .status(HttpStatus.BAD_REQUEST)
                .message(INVALID_PRODUCT.getMessage())
                .detailsMessages(
                        result.getFieldErrors()
                        .stream()
                        .map(fieldError -> fieldError.getField() + ": " + fieldError.getDefaultMessage())
                        .toList()
                )
                .timeStamp(LocalDateTime.now())
                .build();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse handleInternalServeError(Exception ex) {
        return ErrorResponse.builder()
                .code(GENERIC_ERROR.getCode())
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(GENERIC_ERROR.getMessage())
                .detailsMessages(Collections.singletonList(ex.getMessage()))
                .timeStamp(LocalDateTime.now())
                .build();
    }
}
