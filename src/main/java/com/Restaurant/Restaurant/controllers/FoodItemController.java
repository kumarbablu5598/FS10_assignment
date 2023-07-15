package com.Restaurant.Restaurant.controllers;

import com.Restaurant.Restaurant.models.FoodItem;
import com.Restaurant.Restaurant.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/foodItem")
public class FoodItemController {
    @Autowired
    FoodItemService foodItemService;
    @PostMapping("addfood")
    public String addFoodItem(@RequestBody FoodItem foodItem){
        return foodItemService.AddFoodItem(foodItem);
    }
    @GetMapping("getAllFoods")
    public List<FoodItem> getallfoods(){
        return foodItemService.getAllFood();
    }
}
