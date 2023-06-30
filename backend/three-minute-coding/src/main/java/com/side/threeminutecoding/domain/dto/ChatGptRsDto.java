package com.side.threeminutecoding.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class ChatGptRsDto {
    /*
    {
      "id": "chatcmpl-123",
      "object": "chat.completion",
      "created": 1677652288,
      "choices": [{
        "index": 0,
        "message": {
          "role": "assistant",
          "content": "\n\nHello there, how may I assist you today?",
        },
        "finish_reason": "stop"
      }],
      "usage": {
        "prompt_tokens": 9,
        "completion_tokens": 12,
        "total_tokens": 21
      }
    }
     */
    private String id;
    private String object;
    private Long created;
    private List<Choices> choices;
    private Usage usage;

    @Getter
    @ToString
    public static class Choices {
        private Integer index;
        private Message message;
        private String finish_reason;
    }

    @Getter
    @ToString
    public static class Usage {
        private Integer prompt_tokens;
        private Integer completion_tokens;
        private Integer total_tokens;
    }

    @Getter
    @ToString
    public static class Message {
        private String role;
        private String content;
    }

}
