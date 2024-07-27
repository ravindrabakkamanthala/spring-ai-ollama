package com.ravi.spring.ai.controller;

import com.ravi.spring.ai.model.ChatInputRequest;
import com.ravi.spring.ai.service.ChatService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/ai/chat")
public class ChatController {

    @Autowired
    public ChatService chatService;

    @PostMapping(value = "/query")
    public ResponseEntity<Object> chatQuery(@Valid ChatInputRequest request) {
        try {
            String result = chatService.chatQuery(request);
            return ResponseEntity.ok(Map.of("response", result));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(Map.of("error", "Failed to process the request!"));
        }
    }
}
