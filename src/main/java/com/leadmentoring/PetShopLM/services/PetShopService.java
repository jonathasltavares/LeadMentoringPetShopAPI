package com.leadmentoring.PetShopLM.services;

import com.leadmentoring.PetShopLM.repositories.PetShopRepository;
import org.springframework.stereotype.Service;

@Service
public class PetShopService {
    final PetShopRepository petShopRepository;

    public PetShopService(PetShopRepository petShopRepository) {
        this.petShopRepository = petShopRepository;
    }
}
