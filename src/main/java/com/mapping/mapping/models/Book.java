package com.mapping.mapping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    private String title;
    private String author;
    private String description;
    private Integer price;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk-student-id")
    private  Student student;


}
