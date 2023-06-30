package com.side.threeminutecoding.ask;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AskComponent {

    private final ChatGptComponent chatGptComponent;
    private final BingComponent bingComponent;

    public String ask(String question) {

        // checking question type

        // get prompt

        // get chatGPT answer
        String chatGptAnswer = chatGptComponent.ask(question);

        // get bing answer

        // combine one answer from the answers

        // logging

        // return value
        return chatGptAnswer;

    }



}
