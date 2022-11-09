package com.leadmentoring.PetShopLM.services;

import com.leadmentoring.PetShopLM.repositories.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
}
