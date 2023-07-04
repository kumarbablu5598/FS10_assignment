package com.Uem.University.repository;

import com.Uem.University.model.Department;
import com.Uem.University.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student findFirstByDepartment(Department department);

}
