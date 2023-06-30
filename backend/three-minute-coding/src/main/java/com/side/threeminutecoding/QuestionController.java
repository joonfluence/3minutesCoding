package com.side.threeminutecoding;

import com.side.threeminutecoding.ask.AskComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QuestionController {

    private final AskComponent askComponent;

    @GetMapping("/ask")
    public String ask(@RequestParam("question") String question) {
        return askComponent.ask(question);
    }

}
