package com.Restaurant.Restaurant.controllers;

import com.Restaurant.Restaurant.models.User;
import com.Restaurant.Restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("getAllUsers")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }
    @PostMapping("addUser")
    public String createuser(@RequestBody User user){
          return userService.createUser(user);
    }

}
