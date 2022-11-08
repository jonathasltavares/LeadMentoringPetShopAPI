package com.leadmentoring.PetShopLM.repositories;

import com.leadmentoring.PetShopLM.models.PetShopModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PetShopRepository extends JpaRepository<PetShopModel, UUID> {
}
