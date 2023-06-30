package com.side.threeminutecoding.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class ChatGptRqDto {

    private String model;
    private List<ChatGptMessageDto> messages;

    public ChatGptRqDto(String model) {
        this.model = model;
    }

    public void setMessages(String role, String context) {

        if (CollectionUtils.isEmpty(messages)) {
            messages = new ArrayList<>();
        }
        ChatGptMessageDto chatGptMessageDto = new ChatGptMessageDto(role, context);
        messages.add(chatGptMessageDto);

    }

    @AllArgsConstructor
    @Getter
    public static class ChatGptMessageDto {
        private String role;
        private String content;
    }

}


