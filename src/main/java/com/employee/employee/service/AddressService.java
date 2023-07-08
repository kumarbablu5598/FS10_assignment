package com.employee.employee.service;

import com.employee.employee.model.Address;
import com.employee.employee.repository.IaddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IaddressRepo iaddressRepo;
    public List<Address> getAllAddress(){
        return iaddressRepo.findAll();
    }

    public  Address getById(Long Id){
        Optional<Address> optionalAddress = iaddressRepo.findById(Id);
        Address address = null;
        if(optionalAddress.isPresent()){
            address= optionalAddress.get();
        }
        return  address;
    }
    public  String addAddress(Address address){
        iaddressRepo.save(address);
        return "added";
    }
    public  String addAddresses(List<Address> addressList){
        iaddressRepo.saveAll(addressList);
        return "addded list of address";
    }
    public String deleteById(Long Id){
        iaddressRepo.deleteById(Id);
        return "deleted "+Id;
    }
   public String update(Address address,Long Id){
        Address addr = getById(Id);
        if(addr!=null){
            addr.setCity(address.getCity());
            addr.setState(address.getState());
            addr.setStreet(address.getStreet());
            addr.setZipcode(address.getZipcode());
            iaddressRepo.save(addr);
            return "updated "+Id;
        }
        return "unable to update";

   }
    
}
