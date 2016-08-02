package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome, Biblioteca is available!");

        MainMenu menu = new MainMenu();
        menu.show();

        System.out.println("your choice : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            new Choice(br.readLine()).doChoice();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
