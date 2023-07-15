package com.Restaurant.Restaurant.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer quantity ;
    private Boolean status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user-Id")
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foodItem-Id")
    private FoodItem foodItem;

}
