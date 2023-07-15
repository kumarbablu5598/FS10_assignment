package com.Restaurant.Restaurant.service;

import com.Restaurant.Restaurant.models.User;
import com.Restaurant.Restaurant.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;
    public String createUser(User user){
        iUserRepo.save(user);
        return "added";
    }
    public List<User> getAllUsers(){
        return iUserRepo.findAll();
    }
}
