package com.example.kafkawithopensearch.kafka.port.out;

import reactor.core.publisher.Mono;

public interface KafkaPort {

    Mono<Object> testMethod();
}
