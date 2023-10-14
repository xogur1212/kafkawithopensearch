package com.example.kafkawithopensearch.kafka.port.in;

import reactor.core.publisher.Mono;


public interface KafkaUseCase {

    Mono<Object> testMethod();
}
