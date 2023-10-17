package com.example.MyBookShopApp.services;

import com.example.MyBookShopApp.data.author.Author;
import com.example.MyBookShopApp.repositorys.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Map<String, List<Author>> getAuthorsMap(){
        List<Author> authors = new ArrayList<>();
        authorRepository.findAll().forEach(authors::add);

        return authors.stream().collect(Collectors.groupingBy((Author a)-> a.getName().substring(0,1)));
    }
}
