package com.leadmentoring.PetShopLM.dtos;

import com.leadmentoring.PetShopLM.models.PetShopModel;

import javax.validation.constraints.NotBlank;

public class ProductDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private Float price;

    @NotBlank
    private byte[] photo;

    @NotBlank
    private PetShopModel petshop_id;
}
