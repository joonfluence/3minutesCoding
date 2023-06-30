package com.side.threeminutecoding.ask;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BingComponent {

    @Value("${ask.bing.url}")
    private String url;

    @Value("${ask.bing.api-key}")
    private String apiKey;

    public String ask(String question) {
        return "answer";
    }

}
