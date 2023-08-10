package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books/recent")
public class RecentController {

    private final BookService bookService;

    public RecentController(BookService bookService) {
        this.bookService = bookService;
    }

    @ModelAttribute("bookList")
    public List<Book> getBookList() {
        return bookService.getBooksData();
    }

    @GetMapping
    public String getRecentPage() {
        return "books/recent";
    }
}
