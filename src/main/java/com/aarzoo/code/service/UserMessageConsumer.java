package com.aarzoo.code.service;

import com.aarzoo.code.entity.User;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserMessageConsumer {
  private static final Logger LOGGER = LoggerFactory.getLogger(UserMessageConsumer.class);
  @KafkaListener(topics = "userTopic",groupId = "myGroup")
  public void consumeMessage(User user) {
     LOGGER.info(String.format("User Message received -> %s",user.toString()));
  }
}
