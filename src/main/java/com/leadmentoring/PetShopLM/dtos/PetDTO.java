package com.leadmentoring.PetShopLM.dtos;

import com.leadmentoring.PetShopLM.models.PetShopModel;

import javax.validation.constraints.NotBlank;

public class PetDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private Float price;

    @NotBlank
    private byte[] photo;

    @NotBlank
    private String gender;

    @NotBlank
    private int age;

    @NotBlank
    private float weight;

    @NotBlank
    private PetShopModel petshop_id;
}
