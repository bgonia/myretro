package com.apress.myretro.exception;

public class RetroBoardNotFoundException extends RuntimeException{

    public RetroBoardNotFoundException(){
        super("RetroBoard not found");
    }

    public RetroBoardNotFoundException(String message){
        super(String.format("RetroBoard not found: {}", message));
    }

    public RetroBoardNotFoundException(String message, Throwable cause){
        super(String.format("RetroBoard not found: {}", message), cause);
    }

}
