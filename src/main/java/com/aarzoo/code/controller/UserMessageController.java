package com.aarzoo.code.controller;

import com.aarzoo.code.entity.User;
import com.aarzoo.code.service.UserMessageProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/message")
public class UserMessageController {

   private UserMessageProducer userMessageProducer;
    public UserMessageController(UserMessageProducer userMessageProducer) {
        this.userMessageProducer = userMessageProducer;
    }
    @PostMapping("/publish")
    public ResponseEntity<String> sendUserMessage(@RequestBody User user) {
        userMessageProducer.sendMessage(user);
        return ResponseEntity.ok("User message sent to kafka topic");
    }

}
