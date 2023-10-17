package com.example.MyBookShopApp.repositorys;

import com.example.MyBookShopApp.data.book.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
