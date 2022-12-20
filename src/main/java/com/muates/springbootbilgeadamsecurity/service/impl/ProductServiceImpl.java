package com.muates.springbootbilgeadamsecurity.service.impl;

import com.muates.springbootbilgeadamsecurity.model.dto.ProductPageRequest;
import com.muates.springbootbilgeadamsecurity.model.entity.Product;
import com.muates.springbootbilgeadamsecurity.repository.ProductRepository;
import com.muates.springbootbilgeadamsecurity.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Page<Product> getProducts(ProductPageRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        return productRepository.findAll(pageable);
    }
}
