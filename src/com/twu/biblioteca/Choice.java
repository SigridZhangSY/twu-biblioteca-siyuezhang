package com.twu.biblioteca;

public class Choice {

    private int limit;

    public  Choice(){

    }
    public Choice(int limit) {
        this.limit = limit;
    }

    public Boolean doChoice(String choice){

        int choiceNum;

        if (choice.equals("quiet")){
            return true;
        }

        try {
            choiceNum = Integer.valueOf(choice);
        }catch (Exception e){
            System.out.println("Select a valid option!");
            return false;
        }

        if (choiceNum > limit || choiceNum < 1){
            System.out.println("Select a valid option!");
            return false;
        }
        if (choice.equals("1")) {
            new BookList().Show();
            return false;
        }

        return false;
    }

}
