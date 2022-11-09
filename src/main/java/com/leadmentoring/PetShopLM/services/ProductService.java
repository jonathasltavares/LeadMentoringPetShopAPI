package com.leadmentoring.PetShopLM.services;

import com.leadmentoring.PetShopLM.repositories.ProductRepository;

public class ProductService {
    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
