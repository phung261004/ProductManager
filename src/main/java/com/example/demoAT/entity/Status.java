package com.example.demoAT.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "status")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Status  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status_name", nullable = false, unique = true)
    private String statusName;

}
