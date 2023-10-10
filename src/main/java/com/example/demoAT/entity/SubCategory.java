package com.example.demoAT.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sub_category")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SubCategory{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sub_cate_code", unique = true, nullable = false)
    private String subCateCode;

    @Column(name = "sub_cate_name", nullable = false)
    private String subCateName;

    @JoinColumn(name = "cate_id", nullable = false)
    @ManyToOne
    private Category category;

}
