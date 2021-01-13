package com.example.springboottdd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private Long serialId = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }




}
