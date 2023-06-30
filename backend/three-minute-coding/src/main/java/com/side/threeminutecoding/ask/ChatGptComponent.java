package com.side.threeminutecoding.ask;

import com.side.threeminutecoding.domain.dto.ChatGptRqDto;
import com.side.threeminutecoding.domain.dto.ChatGptRsDto;
import com.side.threeminutecoding.util.ObjectMapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class ChatGptComponent {

    @Value("${ask.chat-gpt.url}")
    private String url;

    @Value("${ask.chat-gpt.uri}")
    private String uri;

    @Value("${ask.chat-gpt.api-key}")
    private String apiKey;

    private static final String model = "gpt-3.5-turbo";

    public String ask(String question) {

        WebClient webClient = WebClient.builder()
                .baseUrl(url)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + apiKey)
                .build();

        ChatGptRqDto chatGptRqDto = new ChatGptRqDto(model);
        chatGptRqDto.setName("임승현");
        chatGptRqDto.setMessages("system", "너는 모든 걸 알고 있는 든든한 시니어 개발자야");
        chatGptRqDto.setMessages("user", question);

        ChatGptRsDto chatGptRsDto = webClient.post()
                .uri(uri)
                .bodyValue(ObjectMapperUtils.writeValueAsString(chatGptRqDto))
                .retrieve()
                .bodyToMono(ChatGptRsDto.class)
                .block();

        return chatGptRsDto.toString();

    }

}
