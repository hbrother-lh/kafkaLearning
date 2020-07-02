package com.imooc.useKakfa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(KafkaApplication.class, args);

        ProducerTemplate producerTemplate = context.getBean(ProducerTemplate.class);
        for(int i=0;i<10;i++){
            producerTemplate.send("dfc"+i);
        }
        //SpringApplication.run(KafkaApplication.class,args);
    }
}
