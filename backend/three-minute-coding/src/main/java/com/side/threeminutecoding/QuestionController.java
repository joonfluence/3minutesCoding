package com.side.threeminutecoding;

import com.side.threeminutecoding.ask.AskComponent;
import com.side.threeminutecoding.domain.dto.AskRq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QuestionController {

    private final AskComponent askComponent;

    @PostMapping("/ask")
    public String ask(AskRq rq) {
        return askComponent.ask(rq.getQuestion());
    }

}
