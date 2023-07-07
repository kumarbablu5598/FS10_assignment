package com.employee.employee.repository;

import com.employee.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IemployeeRepo extends JpaRepository<Employee,Long> {
}
