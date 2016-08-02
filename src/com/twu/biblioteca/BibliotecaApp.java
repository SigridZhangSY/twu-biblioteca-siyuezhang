package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        new WelcomeMessage("Welcome, Biblioteca is available!").show();
        MainMenu menu = new MainMenu();
        menu.show();
        boolean flag = false;
        while (flag == false) {
            System.out.println("your choice : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                flag = new Choice(1).doChoice(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
