package com.example.MyBookShopApp.repositorys;

import com.example.MyBookShopApp.data.author.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
