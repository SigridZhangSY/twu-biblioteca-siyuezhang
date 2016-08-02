package com.twu.biblioteca;

public class WelcomeMessage {
    private String message;


    public WelcomeMessage(String message) {
        this.message = message;
    }

    public void show(){
        System.out.println(message);
    }
}
