package com.example.demoAT.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ProductBrandPK implements Serializable {

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "brand_id")
    private Long brandId;

}
