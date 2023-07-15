package com.mapping.mapping.services;

import com.mapping.mapping.models.Course;
import com.mapping.mapping.models.Laptop;
import com.mapping.mapping.repositorys.ICourseRepo;
import com.mapping.mapping.repositorys.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo iLaptopRepo;
    public List<Laptop> getAlllaptops(){
        return iLaptopRepo.findAll();
    }
    public Laptop getlaptopById(Integer Id){
        Optional<Laptop> laptopOptional = iLaptopRepo.findById(Id);
        Laptop laptop = null;
        if(laptopOptional.isPresent()) laptop=laptopOptional.get();
        return laptop;

    }
    public String addLaptop(Laptop laptop){
        iLaptopRepo.save(laptop);
        return "added";
    }
    public String deleteById(Integer Id){
        iLaptopRepo.deleteById(Id);
        return "deleted";
    }
}
