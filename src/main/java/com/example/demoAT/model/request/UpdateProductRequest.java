package com.example.demoAT.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateProductRequest {
    private String productName;

    private String color;

    private Long quantity;

    private Double sellPrice;

    private Double originPrice;

    private String description;

    private Long subCateId;

    private Long statusId;
}
