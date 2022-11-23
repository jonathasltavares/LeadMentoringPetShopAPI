package com.leadmentoring.PetShopLM.controllers;



import com.leadmentoring.PetShopLM.dtos.PetDTO;
import com.leadmentoring.PetShopLM.models.PetModel;
import com.leadmentoring.PetShopLM.models.ProductModel;
import com.leadmentoring.PetShopLM.services.PetService;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/Pet")
public class PetController {
    final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping
    public ResponseEntity<Object> savePet(@RequestBody @Valid PetDTO petDTO){
        var petModel = new PetModel();
        BeanUtils.copyProperties(petDTO, petModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(petService.save(petModel));
    }

    @GetMapping
    public ResponseEntity<Page<PetModel>> getAllPet(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(petService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOnePet(@PathVariable(value = "id") UUID id){
        Optional<PetModel> petModelOptional = petService.findById(id);
        if (!petModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pet not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(petModelOptional.get());
    }
    @GetMapping("/petshop")
    public ResponseEntity<Page<PetModel>> getByPetshop(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable, @RequestParam("id") UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(petService.findByPetshop(id, pageable));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePet(@PathVariable(value = "id") UUID id){
        Optional<PetModel> petModelOptional = petService.findById(id);
        if (!petModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pet not found.");
        }
        petService.delete(petModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Pet deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePet(@PathVariable(value = "id") UUID id,
                                                @RequestBody @Valid PetDTO petDTO){
        Optional<PetModel> petModelOptional = petService.findById(id);
        if (!petModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pet not found.");
        }
        var petModel = new PetModel();
        BeanUtils.copyProperties(petDTO, petModel);
        petModel.setId(petModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(petService.save(petModel));
    }
}
