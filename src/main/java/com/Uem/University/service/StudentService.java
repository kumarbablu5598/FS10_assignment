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
        Student stu=null;
        if(optionalStudent.isPresent())
            stu=optionalStudent.get();

        return stu;

    }
    public String addStudent(Student student){
        studentRepo.save(student);
        return "added student";
    }
    public String addstudents(List<Student> students){
        studentRepo.saveAll(students);
        return "added list of students";
    }
    public  String deletestudentById(Integer Id){
        studentRepo.deleteById(Id);
        return "deleted Id "+ Id;
    }
    public  String updateById(Student student,Integer Id){
        Student updatestudent = getStudentById(Id);
        //Student updatestudent = studentRepo.findById(Id).get();
        if(updatestudent!=null){
            updatestudent.setAge(student.getAge());
            updatestudent.setDepartment(student.getDepartment());
            updatestudent.setFirstName(student.getFirstName());
            updatestudent.setLastName(student.getLastName());
            studentRepo.save(updatestudent);
            return  "updated "+Id;
        }
       return  "unable to update";

    }
    public String  updateByDepartment(Student student, Department department){
        Iterable<Student> students = getallStudents();
        for(Student stu : students)
        {
            if(stu.getDepartment().equals(department))
            {
                stu.setStudentId(student.getStudentId());
                stu.setAge(student.getAge());
                stu.setLastName(student.getLastName());
                stu.setFirstName(student.getFirstName());
                studentRepo.save(stu);
                return "update Department " + department;
            }
        }
        return  "unable to update";
    }
}
