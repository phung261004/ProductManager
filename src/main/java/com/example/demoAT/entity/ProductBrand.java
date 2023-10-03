package com.example.demoAT.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

@Entity
@Table(name = "product_brand")
@Data
@NoArgsConstructor
public class ProductBrand implements Serializable {

    @EmbeddedId
    private ProductBrandPK id;

    @JoinColumn(name = "product_id", nullable = false)
    @OneToOne
    private Product product;

    @JoinColumn(name = "brand_id", nullable = false)
    @ManyToOne
    private Brand brand;


}
