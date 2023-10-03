package com.example.demoAT.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class ProductBrandPK implements Serializable {

    private int productId;
    private int brandId;


}
