package org.example;
public class InformationNotFoundException extends RuntimeException {
    public InformationNotFoundException(String message){
        super(message);
    }
}
