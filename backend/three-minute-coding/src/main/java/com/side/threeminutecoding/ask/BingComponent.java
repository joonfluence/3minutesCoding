package com.side.threeminutecoding.ask;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BingComponent {

    private final AskConfigProperties askConfigProperties;

    public String ask() {
        askConfigProperties.getBingApiKey();
        askConfigProperties.getBingUrl();
        return "answer";
    }

}
