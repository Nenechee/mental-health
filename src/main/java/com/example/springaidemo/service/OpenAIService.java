package com.example.springaidemo.service;  // This should match the package structure

import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.ai.openai.api.OpenAiApi.ChatRequest;
import org.springframework.ai.openai.api.OpenAiApi.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenAIService {
    private final OpenAiApi openAiApi;

    @Autowired
    public OpenAIService(OpenAiApi openAiApi) {
        this.openAiApi = openAiApi;
    }

    public String getChatResponse(String prompt) {
        ChatRequest request = ChatRequest.builder()
                .model("gpt-3.5-turbo")
                .message(prompt)
                .build();

        ChatResponse response = openAiApi.chat(request);
        return response.getChoices().get(0).getMessage().getContent();
    }
}
