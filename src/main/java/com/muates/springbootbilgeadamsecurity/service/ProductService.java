package com.muates.springbootbilgeadamsecurity.service;

import com.muates.springbootbilgeadamsecurity.model.dto.ProductPageRequest;
import com.muates.springbootbilgeadamsecurity.model.entity.Product;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ProductService {
    Product addProduct(Product product);
    Optional<Product> getProduct(Long id);
    Page<Product> getProducts(ProductPageRequest request);
}
