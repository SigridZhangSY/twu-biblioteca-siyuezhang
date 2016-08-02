package com.twu.biblioteca;

public class Choice {

    private int limit;

    public  Choice(){

    }
    public Choice(int limit) {
        this.limit = limit;
    }

    public Boolean doChoice(String choice){
        if (Integer.valueOf(choice) > limit || Integer.valueOf(choice) < 1){
            System.out.println("Select a valid option!");
            return false;
        }
        if (choice.equals("1")) {
            new BookList().Show();
            return true;
        }
        return false;
    }

}
