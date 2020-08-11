package com.bookshop.management.controller;

import com.bookshop.management.model.Book;
import com.bookshop.management.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/books")
public class BookController {

  @Autowired
  BookRepository bookRepository;

  @GetMapping(value="/all")
  public List<Book> getBooks() {
    return bookRepository.findAll();
  }
}
