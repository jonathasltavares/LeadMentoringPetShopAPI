package com.leadmentoring.PetShopLM.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@Table(name="pet")
public class PetModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "pet_name", nullable = false)
    private String name;

    @Column(name="pet_description", nullable = false)
    private String description;

    @Column(name = "pet_price", nullable = false)
    private Float price;


    @Column(name="pet_photo", nullable = false)
    private String photo;

    @Column(name="pet_gender", nullable = false)
    private String gender;

    @Column(name="pet_age", nullable = false)
    private String age;

    @Column(name="pet_weight", nullable = false)
    private float weight;

    @ManyToOne
    @JoinColumn(name="petshop", nullable = false)
    private PetShopModel petshop;
}
