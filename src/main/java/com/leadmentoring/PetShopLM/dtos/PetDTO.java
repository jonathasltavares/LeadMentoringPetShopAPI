package com.leadmentoring.PetShopLM.dtos;

import com.leadmentoring.PetShopLM.models.PetShopModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PetDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @NotBlank
    private String species;

    @NotNull
    private Float price;

    @NotBlank
    private String photo;

    @NotBlank
    private String gender;

    @NotBlank
    private String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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
