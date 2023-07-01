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
   @Pattern(regexp = "[A-Z][a-zA-Z]*")
    private String FirstName;
   @Pattern(regexp = "[A-Z][a-zA-Z]*")
    private String Lastname;
    @Min(value=10)
    @Max(value = 25)
    private Integer age;
    private Department department;
}
