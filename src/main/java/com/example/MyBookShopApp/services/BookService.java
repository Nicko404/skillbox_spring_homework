package com.example.MyBookShopApp.services;

import com.example.MyBookShopApp.data.book.Book;
import com.example.MyBookShopApp.repositorys.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

   private final BookRepository bookRepository;

   public BookService(BookRepository bookRepository) {
       this.bookRepository = bookRepository;
   }

    public List<Book> getBooksData(){
       List<Book> bookList = new ArrayList<>();
       bookRepository.findAll().forEach(bookList::add);
       return bookList;
    }
}
