package com.example.MyBookShopApp.data.book.file;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "book_file")
@Getter
@Setter
public class BookFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String hash;

    @Column(name = "type_id", columnDefinition = "INT NOT NULL")
    private Integer typeId;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String path;
}
