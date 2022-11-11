package com.leadmentoring.PetShopLM.controllers;

import com.leadmentoring.PetShopLM.dtos.PetShopDTO;
import com.leadmentoring.PetShopLM.models.PetShopModel;
import com.leadmentoring.PetShopLM.services.PetShopService;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/PetShop")
public class PetShopController {
    final PetShopService petShopService;

    public PetShopController(PetShopService petShopService) {
        this.petShopService = petShopService;
    }

    @PostMapping
    public ResponseEntity<Object> savePetShop(@RequestBody @Valid PetShopDTO petShopDTO){
        var petShopModel = new PetShopModel();
        BeanUtils.copyProperties(petShopDTO, petShopModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(petShopService.save(petShopModel));
    }

    @GetMapping
    public ResponseEntity<Page<PetShopModel>> getAllPetShops(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(petShopService.findAll(pageable));
    }
    @GetMapping("/login")
    public ResponseEntity<Object> getByEmail(@RequestParam("email") String email, @RequestParam("password") String password) {
        PetShopModel petshop = petShopService.findByEmail(email);
        if(!petshop.getPassword().equals(password)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PetShop not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(petShopService.findByEmail(email));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOnePetShop(@PathVariable(value = "id") UUID id){
        Optional<PetShopModel> petShopModelOptional = petShopService.findById(id);
        if (!petShopModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PetShop not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(petShopModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePetShop(@PathVariable(value = "id") UUID id){
        Optional<PetShopModel> petShopModelOptional = petShopService.findById(id);
        if (!petShopModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PetShop not found.");
        }
        petShopService.delete(petShopModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("PetShop deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePetShop(@PathVariable(value = "id") UUID id,
                                                    @RequestBody @Valid PetShopDTO petShopDTO){
        Optional<PetShopModel> petShopModelOptional = petShopService.findById(id);
        if (!petShopModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PetShop not found.");
        }
        var petShopModel = new PetShopModel();
        BeanUtils.copyProperties(petShopDTO, petShopModel);
        petShopModel.setId(petShopModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(petShopService.save(petShopModel));
    }
}

