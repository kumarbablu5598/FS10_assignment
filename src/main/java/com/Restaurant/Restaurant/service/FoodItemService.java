package com.Restaurant.Restaurant.service;

import com.Restaurant.Restaurant.models.FoodItem;
import com.Restaurant.Restaurant.repository.IFoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    IFoodItemRepo iFoodItemRepo;
    public List<FoodItem> getAllFood(){
        return iFoodItemRepo.findAll();
    }
    public  String AddFoodItem(FoodItem foodItem){
        iFoodItemRepo.save(foodItem);
        return "food added";
    }
}
