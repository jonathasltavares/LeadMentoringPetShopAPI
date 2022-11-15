package com.leadmentoring.PetShopLM.dtos;

import com.leadmentoring.PetShopLM.models.PetShopModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PetDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotNull
    private Float price;

    @NotBlank
    private String photo;

    @NotBlank
    private String gender;

    @NotNull
    private int age;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public PetShopModel getPetshop() {
        return petshop;
    }

    public void setPetshop(PetShopModel petshop) {
        this.petshop = petshop;
    }

    @NotNull
    private float weight;

    @NotNull
    private PetShopModel petshop;
}
