package com.mapping.mapping.controllers;

import com.mapping.mapping.models.Address;
import com.mapping.mapping.models.Laptop;
import com.mapping.mapping.services.AddressService;
import com.mapping.mapping.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("laptops")
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @GetMapping("getAll")
    public List<Laptop> getAlllaptp(){
        return laptopService.getAlllaptops();
    }
    @GetMapping("getById/{Id}")
    public Laptop getbyId(@PathVariable Integer Id){
        return laptopService.getlaptopById(Id);
    }
    @PostMapping("addlaptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }
    @DeleteMapping("delete/{Id}")
    public String deletById(@PathVariable Integer Id){
        return laptopService.deleteById(Id);
    }
}
