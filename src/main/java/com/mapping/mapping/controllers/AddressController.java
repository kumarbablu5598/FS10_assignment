package com.mapping.mapping.controllers;

import com.mapping.mapping.models.Address;
import com.mapping.mapping.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("getAll")
    public List<Address> getAllAddress(){
       return addressService.getAllAddress();
    }
    @GetMapping("getById/{Id}")
    public Address getbyId(@PathVariable Integer Id){
        return addressService.getAddressById(Id);
    }
    @PostMapping("addaddress")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @DeleteMapping("delete/{Id}")
    public String deletById(@PathVariable Integer Id){
        return addressService.deleteById(Id);
    }
}
