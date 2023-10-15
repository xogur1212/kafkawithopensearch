package com.example.kafkawithopensearch.opensearch.book.port.in;


import com.example.kafkawithopensearch.opensearch.book.domain.Book;

import java.util.List;

public interface BookUseCase {
    List<Book> getBookList();
}
