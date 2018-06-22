package com.example.sampleSpringProject.exceptions;

public class InvalidRequestBodyException extends RuntimeException{

    public InvalidRequestBodyException(String message) {
        super(message);
    }

}