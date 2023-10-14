package com.example.kafkawithopensearch.kafka.listner;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class TestKafkaListener {

    @KafkaListener(topics = "test", groupId = "testGroup")
    public void testListener() {

        log.info("getMessageFromKafka");
    }


}
