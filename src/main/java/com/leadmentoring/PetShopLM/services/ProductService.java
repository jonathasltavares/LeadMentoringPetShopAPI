package com.leadmentoring.PetShopLM.services;

import com.leadmentoring.PetShopLM.models.PetShopModel;
import com.leadmentoring.PetShopLM.models.ProductModel;
import com.leadmentoring.PetShopLM.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Object save(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public Page<ProductModel> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Optional<ProductModel> findById(UUID id) {
        return productRepository.findById(id);
    }

    @Transactional
    public void delete(ProductModel productModel) {
        productRepository.delete(productModel);
    }


    public Page<ProductModel> findByPetshop(UUID id, Pageable pageable) {
        return productRepository.findAllByPetshopId(id, pageable);
    }
}
