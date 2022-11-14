package com.leadmentoring.PetShopLM.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@Table(name = "petshop")
public class PetShopModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name ="petshop_name",nullable = false, unique = true)
    private String name;


    @Column(name ="petshop_logo",nullable = false)
    private String logo;

    @Column(name ="petshop_email",nullable = false, unique = true)
    private String email;

    @Column(name ="petshop_password",nullable = false, unique = true)
    private String password;
}
