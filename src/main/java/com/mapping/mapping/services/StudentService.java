package com.mapping.mapping.services;

import com.mapping.mapping.models.Course;
import com.mapping.mapping.models.Student;
import com.mapping.mapping.repositorys.ICourseRepo;
import com.mapping.mapping.repositorys.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;
    public List<Student> getAllstudents(){
        return iStudentRepo.findAll();
    }
    public Student getcourseById(Integer Id){
        Optional<Student> studentOptional = iStudentRepo.findById(Id);
        Student student = null;
        if(studentOptional.isPresent()) student=studentOptional.get();
        return student;

    }
    public String addstudent(Student student){
        iStudentRepo.save(student);
        return "added";
    }
    public String deleteById(Integer Id){
        iStudentRepo.deleteById(Id);
        return "deleted";
    }
}
