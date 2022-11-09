package com.leadmentoring.PetShopLM.services;

import com.leadmentoring.PetShopLM.models.PetModel;
import com.leadmentoring.PetShopLM.repositories.PetRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
public class PetService {
    final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Transactional
    public Object save(PetModel petModel) {
        return petRepository.save(petModel);
    }


    public Page<PetModel> findAll(Pageable pageable) {
        return petRepository.findAll(pageable);
    }

    public Optional<PetModel> findById(UUID id) {
        return petRepository.findById(id);
    }

    @Transactional
    public void delete(PetModel petModel) {
        petRepository.delete(petModel);
    }
}
