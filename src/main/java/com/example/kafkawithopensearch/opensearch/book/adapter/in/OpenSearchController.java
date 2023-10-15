package com.example.kafkawithopensearch.opensearch.book.adapter.in;

import com.example.kafkawithopensearch.opensearch.book.domain.Book;
import com.example.kafkawithopensearch.opensearch.book.port.in.BookUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class OpenSearchController {


    private final BookUseCase bookUseCase;

    @GetMapping
    public ResponseEntity<List<Book>> getBookList() {

        return ResponseEntity.ok(bookUseCase.getBookList());
    }


}
