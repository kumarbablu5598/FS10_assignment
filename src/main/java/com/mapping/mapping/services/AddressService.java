package com.mapping.mapping.services;

import com.mapping.mapping.models.Address;
import com.mapping.mapping.repositorys.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;
    public List<Address> getAllAddress(){
        return iAddressRepo.findAll();
    }
    public Address getAddressById(Integer Id){
        Optional<Address> addressOptional = iAddressRepo.findById(Id);
        Address address=null;
        if(addressOptional.isPresent()) address=addressOptional.get();
        return  address;
    }
    public String addAddress(Address address){
        iAddressRepo.save(address);
        return "added";
    }
    public String deleteById(Integer Id){
        iAddressRepo.deleteById(Id);
        return "deleted";
    }
}

