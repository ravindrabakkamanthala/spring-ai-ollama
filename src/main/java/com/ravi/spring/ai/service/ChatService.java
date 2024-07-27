package com.ravi.spring.ai.service;

import com.ravi.spring.ai.model.ChatInputRequest;
import jakarta.validation.Valid;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    public OllamaChatModel chatModel;

    public String chatQuery(@Valid ChatInputRequest input) {
        return chatModel.call(input.getMessage());
    }
}
