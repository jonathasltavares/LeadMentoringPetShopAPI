package com.leadmentoring.PetShopLM.repositories;

import com.leadmentoring.PetShopLM.models.PetModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PetRepository extends JpaRepository<PetModel, UUID> {
    Page<PetModel> findAllByPetshopId(UUID id, Pageable pageable);
}
