package com.leadmentoring.PetShopLM.repositories;

import com.leadmentoring.PetShopLM.models.PetShopModel;
import com.leadmentoring.PetShopLM.models.ProductModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
    Page<ProductModel> findAllByPetshopId(UUID id, Pageable pageable);
}
