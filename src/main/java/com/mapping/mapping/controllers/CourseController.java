package com.mapping.mapping.controllers;

import com.mapping.mapping.models.Address;
import com.mapping.mapping.models.Course;
import com.mapping.mapping.services.AddressService;
import com.mapping.mapping.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("getAll")
    public List<Course> getAllcourses(){
        return courseService.getAllcourse();
    }
    @GetMapping("getById/{Id}")
    public Course getbyId(@PathVariable Integer Id){
        return courseService.getcourseById(Id);
    }
    @PostMapping("addcourse")
    public String addCourse(@RequestBody Course course){
        return courseService.addcourse(course);
    }
    @DeleteMapping("delete/{Id}")
    public String deletById(@PathVariable Integer Id){
        return courseService.deleteById(Id);
    }
}
