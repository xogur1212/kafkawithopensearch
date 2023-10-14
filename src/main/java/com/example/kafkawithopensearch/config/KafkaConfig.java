package com.example.kafkawithopensearch.config;


import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConfig {

    @Value("${spring.kafka.uri}")
    private String KAFKA_SERVER;

    @Value("${spring.kafka.offset.reset.value}")
    private String AUTO_OFFSET_RESET_CONFIG_VALUE;

    @Value("${spring.kafka.enable.auto.commit.config.value}")
    private boolean ENABLE_AUTO_COMMIT_CONFIG_VALUE;

    @Value("${spring.kafka.idle.timeout}")
    private int IDLE_TIMEOUT;


    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,String> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String,String> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConcurrency(1);
        factory.setConsumerFactory(new DefaultKafkaConsumerFactory<>(getConfig()));
        factory.getContainerProperties().setPollTimeout(IDLE_TIMEOUT);
        return factory;

    }

    public Map<String, Object> getConfig() {

        Map<String,Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KAFKA_SERVER);
        config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, AUTO_OFFSET_RESET_CONFIG_VALUE);//컨슈머가 처음 시작될 때 또는 이전에 오프셋이 없을 때, 또는 오프셋이 더 이상 유효하지 않을 때 어떻게 동작해야 하는지를 결정하는 옵션
        config.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,ENABLE_AUTO_COMMIT_CONFIG_VALUE);
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        return config;

    }
    
    @Bean 
    public ProducerFactory<String, String> producerFactory() {
        Map<String,Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,KAFKA_SERVER);
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return new DefaultKafkaProducerFactory<>(config);
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() { return new KafkaTemplate<>(producerFactory());}


    



}
