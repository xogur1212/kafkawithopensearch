package com.example.kafkawithopensearch.kafka.adapter.out;

import com.example.kafkawithopensearch.kafka.port.out.KafkaPort;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.objenesis.SpringObjenesis;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;




@Service
@RequiredArgsConstructor
public class KafkaSendAdapter implements KafkaPort {

    private final KafkaTemplate<String,String> kafkaTemplate;
    @Override
    public Mono<Object> testMethod() {
        kafkaTemplate.send(new ProducerRecord<>("test","test"));

        return Mono.just("success");
    }
}
