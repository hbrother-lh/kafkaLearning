package com.imooc.useKakfa;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerTemplate {
    @Autowired
    KafkaTemplate kafkaTemplate;

    public void send(String name){
        User user = new User();
        user.setName(name);
        user.setAge(11);
        kafkaTemplate.send("topicTest", JSON.toJSONString(user));
    }
}
