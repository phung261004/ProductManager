package com.example.demoAT.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDetailResponse {

    private Long productId;

    private String subCateName;

    private String productName;

    private String color;

    private Long quantity;

    private Double sellPrice;

    private Double originPrice;

    private String statusName;

    private String brandName;

    private String description;
}
