package com.apress.myretro.exception;

public class CardNotFoundException extends RuntimeException{

    public CardNotFoundException(){
        super("Card not found");
    }

    public CardNotFoundException(String message){
        super(String.format("Card not found"));
    }

    public CardNotFoundException(String message, Throwable cause){
        super(String.format("Card not found"), cause);
    }

}
