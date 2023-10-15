package com.example.kafkawithopensearch.opensearch.book.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "books")
public class Book {

    @Id
    private String id;

    private String title;

    @Field(name = "publication_year")
    private int publicationYear;

    @Field(name = "author_name")
    private String authorName;

    private String isbn;

    // getters and setters
}