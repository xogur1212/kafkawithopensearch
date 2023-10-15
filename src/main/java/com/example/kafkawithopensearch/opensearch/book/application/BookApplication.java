package com.example.kafkawithopensearch.opensearch.book.application;


import com.example.kafkawithopensearch.opensearch.book.adapter.out.repository.BookRepository;
import com.example.kafkawithopensearch.opensearch.book.domain.Book;
//import com.example.kafkawithopensearch.opensearch.adapter.repository.BookRepository;
import com.example.kafkawithopensearch.opensearch.book.port.in.BookUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookApplication implements BookUseCase {


    private final BookRepository bookRepository;


    @Override
    public List<Book> getBookList() {
        return this.iterableToList(bookRepository.findAll());
    }


    private <T> List<T> iterableToList(Iterable<T> iterable) {
        List<T> result = new ArrayList<>();
        iterable.forEach(result::add);
        return result;
    }
    // other methods

}