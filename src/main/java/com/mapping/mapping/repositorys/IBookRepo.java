package com.mapping.mapping.repositorys;

import com.mapping.mapping.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,Integer> {

}
