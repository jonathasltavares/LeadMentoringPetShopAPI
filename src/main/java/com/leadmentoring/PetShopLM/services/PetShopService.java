package com.leadmentoring.PetShopLM.services;

import com.leadmentoring.PetShopLM.models.PetShopModel;
import com.leadmentoring.PetShopLM.repositories.PetShopRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PetShopService {
    final PetShopRepository petShopRepository;


    public PetShopService(PetShopRepository petShopRepository) {
        this.petShopRepository = petShopRepository;
    }

    @Transactional
    public PetShopModel save(PetShopModel petShopModel) {
        return petShopRepository.save(petShopModel);
    }

    public Page<PetShopModel> findAll(Pageable pageable) {
        return petShopRepository.findAll(pageable);
    }

    public PetShopModel findByEmail(String email) {
        return petShopRepository.findByEmail(email);
    }

    public Optional<PetShopModel> findById(UUID id) {
        return petShopRepository.findById(id);
    }

    @Transactional
    public void delete(PetShopModel petShopModel) {
        petShopRepository.delete(petShopModel);
    }
}
