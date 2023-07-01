package com.Uem.University.service;

import com.Uem.University.model.Department;
import com.Uem.University.model.Student;
import com.Uem.University.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public Iterable<Student>  getallStudents(){
        return  studentRepo.findAll();

    }

    public Student getStudentById(Integer Id){
        Optional<Student> optionalStudent = studentRepo.findById(Id);
        return optionalStudent.get();

    }
    public String addStudent(Student student){
        studentRepo.save(student);
        return "added";
    }
    public String addstudents(List<Student> students){
        studentRepo.saveAll(students);
        return "added";
    }
    public  void deletestudentById(Integer Id){
        studentRepo.deleteById(Id);
    }
    public  void updateById(Student student,Integer Id){
        Student updatestudent = getStudentById(Id);
        updatestudent.setAge(student.getAge());
        updatestudent.setDepartment(student.getDepartment());
        updatestudent.setFirstName(student.getFirstName());
        updatestudent.setLastname(student.getLastname());

    }
    public void updateByDepartment(Student student, Department department){
        Iterable<Student> students = getallStudents();
        for(Student stu : students){
            if(stu.getDepartment().equals(department)){
                stu.setStudentId(student.getStudentId());
                stu.setAge(student.getAge());
                stu.setLastname(student.getLastname());
                stu.setFirstName(student.getFirstName());
            }
        }
    }
}
