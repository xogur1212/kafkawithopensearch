package com.example.kafkawithopensearch.kafka.adapter.in;

import com.example.kafkawithopensearch.kafka.port.in.KafkaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;



@RestController
@RequiredArgsConstructor
@RequestMapping("kafka")
public class KafkaController {

    private final KafkaUseCase kafkaUseCase;
    @PostMapping
    public Mono<Object> sendKafka(){
        return kafkaUseCase.testMethod();
    }

}
