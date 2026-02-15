package com.example.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public class HMSExceptionHandler {

    @ExceptionHandler({RuntimeException.class, NullPointerException.class})
    public String handleException(Exception e){
        return "ERROR OCCURRED";
    }
}
