package com.example.demoAT.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_brand")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductBrand{

    @EmbeddedId
    private ProductBrandPK id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("brandId")
    @JoinColumn(name = "brand_id")
    private Brand brand;


}
