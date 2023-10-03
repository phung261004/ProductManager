package com.example.demoAT.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_name", nullable = false, unique = true)
    private String productName;

    @Column(name = "color")
    private String color;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "sell_price")
    private double sellPrice;

    @Column(name = "origin_price")
    private double originPrice;

    @Column(name = "description", length = 1000)
    private String description;

    @JoinColumn(name = "subcate_id", nullable = false, referencedColumnName = "id")
    @ManyToOne
    private SubCategory subCategory;

    @JoinColumn(name = "status_id", nullable = false, referencedColumnName = "id")
    @OneToOne
    private Status status;

}
