package com.company.jupiter.external;

public class TwitchException extends RuntimeException {
    public TwitchException(String errorMessage) {
        super(errorMessage);
    }
}
