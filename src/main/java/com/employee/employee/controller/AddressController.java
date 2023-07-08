package com.employee.employee.controller;

import com.employee.employee.model.Address;
import com.employee.employee.service.AddressService;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("getall")
    public List<Address> getAllAdddress(){
        return addressService.getAllAddress();
    }
    @GetMapping("getbyId/{Id}")
    public Address getById(@PathVariable Long Id){
        return addressService.getById(Id);
    }
    @PostMapping("addAll")
    public String addAll(@RequestBody List<Address> addressList){
        return  addressService.addAddresses(addressList);
    }
    @PostMapping("addone")
    public String addadress(@RequestBody Address address){
        return addressService.addAddress(address);

    }
    @DeleteMapping("delete/{Id}")
    public String deletedByid(@PathVariable Long Id){
        return addressService.deleteById(Id);
    }
    @PutMapping("update/{Id}")
    public String updateById(@RequestBody Address address,@PathVariable Long Id){
        return addressService.update(address,Id);
    }

}
