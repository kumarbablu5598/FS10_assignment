package com.mapping.mapping.repositorys;

import com.mapping.mapping.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,Integer> {
}
