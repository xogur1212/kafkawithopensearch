package com.example.kafkawithopensearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


//@EnableElasticsearchRepositories(basePackageClasses = BookRepository.class)
@SpringBootApplication(exclude = {ElasticsearchDataAutoConfiguration.class})
@EnableElasticsearchRepositories
//@SpringBootApplication
public class KafkaWithOpenSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWithOpenSearchApplication.class, args);
    }

}
