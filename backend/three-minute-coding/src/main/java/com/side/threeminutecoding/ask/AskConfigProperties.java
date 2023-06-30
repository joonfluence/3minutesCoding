package com.side.threeminutecoding.ask;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ask")
@Getter
public class AskConfigProperties {

    private String bingUrl;
    private String bingApiKey;

    private String chatGptUrl;
    private String chatGptApiKey;

}
