package com.example.kafkawithopensearch.kafka.application;

import com.example.kafkawithopensearch.kafka.port.in.KafkaUseCase;
import com.example.kafkawithopensearch.kafka.port.out.KafkaPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;



@Component
@RequiredArgsConstructor
public class KafkaApplication implements KafkaUseCase {

    private final KafkaPort kafkaPort;
    @Override
    public Mono<Object> testMethod() {
        return kafkaPort.testMethod();
    }
}
