package com.powervoice.kafka_consumer.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MultiTopicConsumer {

    @KafkaListener(topics = "topic-call")
    public void listenCall(String message) {
        log.info("[topic-call] Received message: {}", message);
    }

    @KafkaListener(topics = "topic-mask")
    public void listenMask(String message) {
        log.info("[topic-mask] Received message: {}", message);
    }

    @KafkaListener(topics = "topic-result")
    public void listenResult(String message) {
        log.info("[topic-result] Received message: {}", message);
    }

    @KafkaListener(topics = "topic-notify")
    public void listenNotify(String message) {
        log.info("[topic-notify] Received message: {}", message);
    }
}
