package com.example.demoAT.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cate_code", nullable = false, unique = true)
    private String cateCode;

    @Column(name = "cate_name")
    private String cateName;

//    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
//    private List<SubCategory> subCategories;
//

}
