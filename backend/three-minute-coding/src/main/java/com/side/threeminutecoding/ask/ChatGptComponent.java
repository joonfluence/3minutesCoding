package com.side.threeminutecoding.ask;

import lombok.RequiredArgsConstructor;
import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ChatGptComponent {

    private final AskConfigProperties askConfigProperties;

    public String ask() {

        return "answer";
    }

}
