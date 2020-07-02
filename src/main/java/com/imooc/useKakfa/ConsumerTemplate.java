package com.imooc.useKakfa;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ConsumerTemplate {
    @KafkaListener(topics="topicTest")
    public void consumer(ConsumerRecord consumerRecord){
        Optional<Object> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        if(kafkaMessage.isPresent()){
            Object ob = kafkaMessage.get();
            System.out.println(ob);
        }
    }
}
