package com.leadmentoring.PetShopLM.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;


public class PetShopDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String logo;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
