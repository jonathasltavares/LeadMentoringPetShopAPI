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

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
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

    public PetShopModel getPetshop_id() {
        return petshop_id;
    }

    public void setPetshop_id(PetShopModel petshop_id) {
        this.petshop_id = petshop_id;
    }

    @NotBlank
    private float weight;

    @NotBlank
    private PetShopModel petshop_id;
}
