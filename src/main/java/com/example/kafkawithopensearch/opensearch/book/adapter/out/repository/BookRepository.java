package com.example.kafkawithopensearch.opensearch.book.adapter.out.repository;

import com.example.kafkawithopensearch.opensearch.book.domain.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book, String> {

    List<Book> findByAuthorName(String authorName);

//    Optional<Book> findByIsbn(String isbn);

    List<Book> findByTitle(String name);

}