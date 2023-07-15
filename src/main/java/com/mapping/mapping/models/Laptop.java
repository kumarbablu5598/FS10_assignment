package com.mapping.mapping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private String name;
    private String brand;
    private Integer price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student-Id")
    private Student student;

}
