package com.example.springaidemo.controller;

import com.example.springaidemo.service.OpenAIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/openai")
public class OpenAIController {

    private final OpenAIService openAIService;

    public OpenAIController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/chat")
    public String chat(@RequestBody String prompt) {
        return openAIService.getChatResponse(prompt);
    }
}
