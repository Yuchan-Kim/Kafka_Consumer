package com.powervoice.kafka_consumer.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MultiTopicConsumer {

    @KafkaListener(topics = "reqdata")
    public void listenReqdata(String message) {

        log.info("[topic-call] Received message: {}", message);
    }


}
