package com.Restaurant.Restaurant.repository;

import com.Restaurant.Restaurant.models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodItemRepo extends JpaRepository<FoodItem,Integer> {
}
