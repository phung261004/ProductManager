package com.example.demoAT.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "sub_category")
@Data
@NoArgsConstructor
public class SubCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "sub_cate_code", unique = true, nullable = false)
    private String subCateCode;

    @Column(name = "sub_cate_name", nullable = false)
    private String subCateName;

    @JoinColumn(name = "cate_id", nullable = false, referencedColumnName = "id")
    @ManyToOne
    private Category category;

}
