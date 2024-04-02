package com.aarzoo.code.service;

import com.aarzoo.code.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class UserMessageProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserMessageProducer.class);
    private KafkaTemplate kafkaTemplate;
    public UserMessageProducer(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(User user) {
        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC,"userTopic")
                .build();
        kafkaTemplate.send(message);
        LOGGER.info(String.format("Message sent to User Topic"));
    }

}
