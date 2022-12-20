package com.muates.springbootbilgeadamsecurity.controller;

import com.muates.springbootbilgeadamsecurity.model.dto.ProductPageRequest;
import com.muates.springbootbilgeadamsecurity.model.entity.Product;
import com.muates.springbootbilgeadamsecurity.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/get/{id}")
    public Optional<Product> getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @GetMapping("/get/products")
    public Page<Product> getProducts(@ModelAttribute ProductPageRequest request) {
        return productService.getProducts(request);
    }
}
