package com.side.threeminutecoding;

public enum Prompt {
    CONCEPT(""),
    ERROR_MESSAGE("")
    ;

    public String message;

    Prompt(String message) {
        this.message = message;
    }

}
