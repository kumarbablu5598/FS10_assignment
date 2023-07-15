package com.mapping.mapping.repositorys;

import com.mapping.mapping.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,Integer> {
}
