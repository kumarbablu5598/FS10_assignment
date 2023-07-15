package com.mapping.mapping.controllers;

import com.mapping.mapping.models.Address;
import com.mapping.mapping.models.Student;
import com.mapping.mapping.services.AddressService;
import com.mapping.mapping.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("getAll")
    public List<Student> getAllstudents(){
        return studentService.getAllstudents();
    }
    @GetMapping("getById/{Id}")
    public Student getbyId(@PathVariable Integer Id){
        return studentService.getcourseById(Id);
    }
    @PostMapping("addstudent")
    public String addstudent(@RequestBody Student student){
        return studentService.addstudent(student);
    }
    @DeleteMapping("delete/{Id}")
    public String deletById(@PathVariable Integer Id){
        return studentService.deleteById(Id);
    }
}
