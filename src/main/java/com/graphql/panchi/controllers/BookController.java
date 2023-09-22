package com.graphql.panchi.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.graphql.panchi.entities.Book;
import com.graphql.panchi.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/books")
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //create



    /*@MutationMapping("createBooks")
    public Book create(@Argument BookInput books) {
        Book b = new Book();
        b.setTitle(books.getTitle());
        b.setDesc(books.getDesc());
        b.setAuthor(books.getAuthor());
        b.setPrice(books.getPrice());
        b.setPages(books.getPages());
        return this.bookService.create(b);
    }*/



   @PostMapping(value = "/create")
    public Book create(@RequestBody String book) throws JsonProcessingException {
       ObjectMapper mapper = new ObjectMapper();
       Book jsonBook = mapper.readValue(book, Book.class);
        return this.bookService.create(jsonBook);
    }
    //get all

    @GetMapping(value = "/allBooks")
    public List<Book> getAll() {
        return this.bookService.getAll();
    }

    //get single book
    @GetMapping("/{bookId}")
    public Book get(@PathVariable int bookId) {
        return this.bookService.get(bookId);
    }

   /* @MutationMapping
    public Book create(Book book){
        return this.bookService.create(book);
    }*/
    //get all

    /*@QueryMapping("allBooks")
    public List<Book> getAll() {
        List<Book> books = this.bookService.getAll();
        return books;
    }

    //get single book
    @QueryMapping("getBook")
    public Book get(@Argument int bookId) {
        Book book = this.bookService.get(bookId);
        return book;
    }

    @Getter
    @Setter
    class BookInput{
        private String title;
        private String desc;
        private String author;
        private double price;
        private int pages;
    }*/

}