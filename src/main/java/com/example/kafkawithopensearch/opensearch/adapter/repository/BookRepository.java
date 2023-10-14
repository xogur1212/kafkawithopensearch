package com.example.kafkawithopensearch.opensearch.adapter.repository;

import com.example.kafkawithopensearch.opensearch.adapter.domain.Book;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends ReactiveElasticsearchRepository<Book, String> {

    Flux<Book> findByAuthorName(String authorName);

//    Optional<Book> findByIsbn(String isbn);

    Flux<Book> findByTitle(String name);

}