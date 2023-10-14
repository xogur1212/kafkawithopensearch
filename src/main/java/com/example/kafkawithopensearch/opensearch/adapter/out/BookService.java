package com.example.kafkawithopensearch.opensearch.adapter.out;


import com.example.kafkawithopensearch.opensearch.adapter.domain.Book;
import com.example.kafkawithopensearch.opensearch.adapter.repository.BookRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Flux<Book> findByAuthor(String authorName) {
        return bookRepository.findByAuthorName(authorName);
    }

    // other methods
}