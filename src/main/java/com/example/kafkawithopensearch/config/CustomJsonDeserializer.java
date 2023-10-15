//package com.example.kafkawithopensearch.config;
//
//import org.apache.kafka.common.serialization.Deserializer;
//import org.springframework.kafka.support.serializer.JsonDeserializer;
//
//import java.util.Map;
//
//public class CustomJsonDeserializer<T> implements Deserializer<T> {
//
//    private final JsonDeserializer<T> jsonDeserializer;
//
//    public CustomJsonDeserializer(JsonDeserializer<T> jsonDeserializer) {
//        this.jsonDeserializer = jsonDeserializer;
//    }
//
//    @Override
//    public T deserialize(String topic, byte[] data) {
//        return jsonDeserializer.deserialize(topic, data);
//    }
//
//    @Override
//    public void configure(Map<String, ?> configs, boolean isKey) {
//        jsonDeserializer.configure(configs, isKey);
//    }
//
//    @Override
//    public void close() {
//        jsonDeserializer.close();
//    }
//}