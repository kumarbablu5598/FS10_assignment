package com.employee.employee.repository;

import com.employee.employee.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IaddressRepo extends JpaRepository<Address,Long> {
}
