package com.lcwd.userservice.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
        super("Resorce not found on server");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}