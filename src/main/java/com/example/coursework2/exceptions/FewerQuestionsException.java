package com.example.coursework2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class FewerQuestionsException extends RuntimeException {
    public FewerQuestionsException(String message) {
        super(message);
    }
}



