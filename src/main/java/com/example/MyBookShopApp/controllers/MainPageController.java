package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.services.BookService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Data
public class MainPageController {

    private final BookService bookService;

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("recommendedBooks", bookService.getBooksData());
        return "index";
    }

}
