package com.mapping.mapping.services;

import com.mapping.mapping.models.Address;
import com.mapping.mapping.models.Course;
import com.mapping.mapping.repositorys.IAddressRepo;
import com.mapping.mapping.repositorys.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;
    public List<Course> getAllcourse(){
        return iCourseRepo.findAll();
    }
    public Course getcourseById(Integer Id){
        Optional<Course> courseOptional = iCourseRepo.findById(Id);
     Course course = null;
     if(courseOptional.isPresent()) course=courseOptional.get();
     return course;

    }
    public String addcourse(Course course){
        iCourseRepo.save(course);
        return "added";
    }
    public String deleteById(Integer Id){
        iCourseRepo.deleteById(Id);
        return "deleted";
    }
}
