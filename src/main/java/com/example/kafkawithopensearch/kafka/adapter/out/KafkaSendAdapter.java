package com.example.kafkawithopensearch.kafka.adapter.out;

import com.example.kafkawithopensearch.kafka.port.out.KafkaPort;
import com.example.kafkawithopensearch.opensearch.book.adapter.out.repository.BookRepository;
import com.example.kafkawithopensearch.opensearch.book.domain.Book;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.objenesis.SpringObjenesis;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;




@Service
@RequiredArgsConstructor
public class KafkaSendAdapter implements KafkaPort {

    private final KafkaTemplate<String,Object> kafkaTemplate;

//    private final BookRepository bookRepository;
    @Override
    public Mono<Object> testMethod() {
//        kafkaTemplate.send(new ProducerRecord<>("test","test"));
        Book book = Book.builder().title("a").authorName("a-Writer").build();
//        bookRepository.save(book);
        kafkaTemplate.send(new ProducerRecord<>("book", book));
        return Mono.just("success");
    }
}
