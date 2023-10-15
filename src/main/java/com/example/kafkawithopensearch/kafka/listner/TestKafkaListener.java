package com.example.kafkawithopensearch.kafka.listner;

import com.example.kafkawithopensearch.opensearch.book.adapter.out.repository.BookRepository;
import com.example.kafkawithopensearch.opensearch.book.domain.Book;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class TestKafkaListener {


    private final BookRepository bookRepository;
    @KafkaListener(topics = "book", groupId = "testGroup")
    public void testListener(Book book) {


        bookRepository.save(book);
        log.info("getMessageFromKafka");


    }


}
