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

    @Column(nullable = false, unique = true)
    private String petshop_name;

    @Lob
    @Column
    private byte[] petshop_logo;

    @Column(nullable = false, unique = true)
    private String petshop_email;

    @Column(nullable = false, unique = true)
    private String petshop_password;
}
