package com.Uem.University.controller;

import com.Uem.University.model.Department;
import com.Uem.University.model.Student;
import com.Uem.University.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("getallstudent")
    public Iterable<Student> getallStudents(){
        return  studentService.getallStudents();
    }
    @GetMapping("getstudent/{Id}")
    public Student getStudentById(@PathVariable  Integer Id){
        return studentService.getStudentById(Id);
    }
    @PostMapping("addstudent")
    public String addstudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PostMapping("addstudents")
    public String addstudents(@RequestBody List<Student> students){
        return studentService.addstudents(students);
    }
    @DeleteMapping("delete/{Id}")
    public  String deletestudentById(@PathVariable Integer Id){
        return studentService.deletestudentById(Id);
    }
    @PutMapping("update/{Id}")
    public String updateById(@RequestBody Student student,@PathVariable Integer Id){
        return  studentService.updateById(student,Id);
    }
    @PutMapping("update/department/{department}")
    public String  updateByDepartment(@PathVariable Department department,@RequestBody Student student){
       return studentService.updateByDepartment(student,department);
    }
}
