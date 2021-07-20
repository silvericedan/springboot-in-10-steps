package com.silvericedan.springboot.basics.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    //going to localhost:8080/books and you get this response as a JSON!!!
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(1l, "Mastering Spring 5.0","Ranga Karanam"));
    }
}
