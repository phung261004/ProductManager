package com.example.demoAT.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "product")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", nullable = false, unique = true)
    private String productName;

    @Column(name = "color")
    private String color;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "sell_price")
    private Double sellPrice;

    @Column(name = "origin_price")
    private Double originPrice;

    @Column(name = "description", length = 1000)
    private String description;

    @JoinColumn(name = "subcate_id", nullable = false)
    @ManyToOne
    private SubCategory subCategory;

    @JoinColumn(name = "status_id", nullable = false)
    @ManyToOne
    private Status status;

}
