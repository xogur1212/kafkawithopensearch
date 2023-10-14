package com.example.kafkawithopensearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

@EnableScheduling
public class KafkaWithOpenSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWithOpenSearchApplication.class, args);
    }

}