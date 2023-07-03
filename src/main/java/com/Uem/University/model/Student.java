package com.Uem.University.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
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
    private Integer StudentId;
    @Pattern(regexp = "^[A-z][a-z0-9_-]{3,19}$")
    private String FirstName;
    @Pattern(regexp = "^[A-z][a-z0-9_-]{3,19}$")
    private String LastName;
    @Min(value=18)
    @Max(value = 25)
    private Integer age;
    private Department department;
}
