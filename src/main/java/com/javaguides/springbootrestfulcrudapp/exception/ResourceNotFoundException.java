package com.javaguides.springbootrestfulcrudapp.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException (String message){
        super(message);
    }

}
