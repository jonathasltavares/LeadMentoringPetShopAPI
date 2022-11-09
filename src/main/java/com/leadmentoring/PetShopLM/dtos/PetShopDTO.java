package com.leadmentoring.PetShopLM.dtos;

import javax.validation.constraints.NotBlank;

public class PetShopDTO {
    @NotBlank
    private String name;

    @NotBlank
    private byte[] logo;

    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
