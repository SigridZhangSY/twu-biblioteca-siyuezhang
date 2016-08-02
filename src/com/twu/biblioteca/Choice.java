package com.twu.biblioteca;

public class Choice {

    private String choice;

    public Choice(String choice) {
        this.choice = choice;
    }

    public void doChoice(){
        if (choice.equals("1"))
            new BookList().Show();
    }

}
