package com.leadmentoring.PetShopLM.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@Table(name="product")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "product_name", nullable = false)
    private String name;

    @Column(name="product_description", nullable = false)
    private String description;

    @Column(name = "product_price", nullable = false)
    private Float price;


    @Column(name="product_photo", nullable = false)
    private String photo;

    @ManyToOne
    @JoinColumn(name="petshop", nullable = false)
    private PetShopModel petshop;
}