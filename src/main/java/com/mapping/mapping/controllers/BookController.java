package com.mapping.mapping.controllers;

import com.mapping.mapping.models.Address;
import com.mapping.mapping.models.Book;
import com.mapping.mapping.services.AddressService;
import com.mapping.mapping.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("getAll")
    public List<Book> getAllbooks(){
        return bookService.getAllbooks();
    }
    @GetMapping("getById/{Id}")
    public Book getbyId(@PathVariable Integer Id){
        return bookService.getbookById(Id);
    }
    @PostMapping("addbook")
    public String addBook(@RequestBody Book book){
        return bookService.addbook(book);
    }
    @DeleteMapping("delete/{Id}")
    public String deletById(@PathVariable Integer Id){
        return bookService.deleteById(Id);
    }
}
