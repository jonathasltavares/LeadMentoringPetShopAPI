package com.leadmentoring.PetShopLM.controllers;


import com.leadmentoring.PetShopLM.dtos.ProductDTO;
import com.leadmentoring.PetShopLM.models.PetShopModel;
import com.leadmentoring.PetShopLM.models.ProductModel;
import com.leadmentoring.PetShopLM.services.ProductService;
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
@RequestMapping("/Product")
public class ProductController {
    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Object> saveProduct(@RequestBody @Valid ProductDTO productDTO){
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productDTO, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(productModel));
    }

    @GetMapping
    public ResponseEntity<Page<ProductModel>> getAllProduct(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll(pageable));
    }

    @GetMapping("/petshop")
    public ResponseEntity<Page<ProductModel>> getByPetshop(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,@RequestParam("name") String name) {
        return ResponseEntity.status(HttpStatus.OK).body(productService.findByPetshop(name, pageable));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneProduct(@PathVariable(value = "id") UUID id){
        Optional<ProductModel> productModelOptional = productService.findById(id);
        if (!productModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(productModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable(value = "id") UUID id){
        Optional<ProductModel> productModelOptional = productService.findById(id);
        if (!productModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
        }
        productService.delete(productModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Product deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable(value = "id") UUID id,
                                            @RequestBody @Valid ProductDTO productDTO){
        Optional<ProductModel> productModelOptional = productService.findById(id);
        if (!productModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found.");
        }
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productDTO, productModel);
        productModel.setId(productModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(productService.save(productModel));
    }
}
