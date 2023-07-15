package com.mapping.mapping.services;

import com.mapping.mapping.models.Address;
import com.mapping.mapping.models.Book;
import com.mapping.mapping.repositorys.IAddressRepo;
import com.mapping.mapping.repositorys.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;
    public List<Book> getAllbooks(){
        return iBookRepo.findAll();
    }
    public Book getbookById(Integer Id){
        Optional<Book> bookOptional= iBookRepo.findById(Id);
      Book book = null;
      if(bookOptional.isPresent()) book=bookOptional.get();
      return book;

    }
    public String addbook(Book book){
       iBookRepo.save(book);
        return "added";
    }
    public String deleteById(Integer Id){
       iBookRepo.deleteById(Id);
        return "deleted";
    }
}
