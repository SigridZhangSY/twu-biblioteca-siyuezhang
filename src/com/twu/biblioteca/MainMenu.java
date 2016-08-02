package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<String> menuList;

    public MainMenu() {
        this.menuList = new ArrayList<String>(){{
            add("List Books");
        }};
    }

    public void show(){
        System.out.println("---------- Main menu ----------");
        for(int i = 0; i < menuList.size(); i++)
            System.out.println((i+1) + ". " + menuList.get(i));
    }
}
