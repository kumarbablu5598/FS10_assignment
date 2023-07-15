package com.mapping.mapping.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;
    private String duration;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "course-student-join-table",joinColumns =
    @JoinColumn(name = "fk_coures-Id"),inverseJoinColumns = @JoinColumn(name = "fk-student-Id"))
    List<Student> students;
}
