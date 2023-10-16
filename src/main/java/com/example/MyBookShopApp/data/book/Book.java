package com.example.MyBookShopApp.data.book;

import com.example.MyBookShopApp.data.author.Author;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "book")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pub_date", columnDefinition = "DATE NOT NULL")
    private LocalDateTime pubDate;

    @Column(name = "is_bestseller", columnDefinition = "BOOLEAN NOT NULL")
    private boolean isBestseller;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String slug;

    @Column(columnDefinition = "VARCHAR(255) NOT NULL")
    private String title;

    @Column(columnDefinition = "VARCHAR(255)")
    private String image;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "INT NOT NULL")
    private Integer price;

    @Column(columnDefinition = "SMALLINT NOT NULL DEFAULT 0")
    private Short discount;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @ManyToOne
//    private Author author;
//
//    private String title;
//
//    @Column(name = "price_old")
//    private Integer priceOld;
//
//    private Integer price;
}

