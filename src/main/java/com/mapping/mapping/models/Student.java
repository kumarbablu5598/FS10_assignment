package com.mapping.mapping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_Id")
    private Address address;
}
