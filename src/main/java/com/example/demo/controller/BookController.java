package com.example.demo.controller;

import com.example.demo.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookController {
    Book book;
    @GetMapping("/book")
    public String book() {
        return book.toString();
    }
}
