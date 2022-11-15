package com.leadmentoring.PetShopLM.dtos;

import com.leadmentoring.PetShopLM.models.PetShopModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotNull
    private Float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public PetShopModel getPetshop_id() {
        return petshop_id;
    }

    public void setPetshop_id(PetShopModel petshop_id) {
        this.petshop_id = petshop_id;
    }

    @NotBlank
    private String photo;

    @NotNull
    private PetShopModel petshop_id;
}
