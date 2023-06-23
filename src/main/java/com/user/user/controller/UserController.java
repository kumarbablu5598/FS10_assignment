package com.user.user.controller;

import com.user.user.model.User;
import com.user.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService usr;
    @GetMapping("getuser/{id}")
    public User findUser(@PathVariable int id) {
        return usr.getUserById(id);
    }
    @GetMapping("getalluser")
    public List<User> getListOfUsers() {
        return usr.finaAll();
    }
    @PostMapping("adduser")
    public void addUser(User userDetails) {

        usr.addUser(userDetails);
    }

    @PutMapping("updateUser/{userId}")
    public void updateUser(@PathVariable int userId, User user){

        usr.updateById(userId,user);
    }
    @DeleteMapping("/delete/{userId}")
    public void deleteUder(@PathVariable int userId) {

        usr.deleteById(userId);
    }


}
