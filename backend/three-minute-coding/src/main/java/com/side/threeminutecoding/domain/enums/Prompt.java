package com.side.threeminutecoding.domain.enums;

import lombok.Getter;

@Getter
public enum Prompt {
    CONCEPT(""),
    ERROR_MESSAGE(""),
    SYSTEM("너는 모든 걸 알고 있는 든든한 시니어 개발자야"),
    ;
    public final String message;

    Prompt(String message) {
        this.message = message;
    }

}
