package com.twu.biblioteca;


import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ExampleTest {

    PrintStream console = null;
    ByteArrayOutputStream bytes = null;
    BibliotecaApp bibliotecaApp = new BibliotecaApp();
    String[] args = new String[0];


    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void should_show_welcome_message(){
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
        bibliotecaApp.main(args);

        String s = new String("Welcome, Biblioteca is available!\n");
        assertThat(bytes.toString(), containsString(s));
    }

    @Test
    public void shold_show_book_list(){
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
        new BookList().Show();

        String s = new String("1. Core Java");
        assertThat(bytes.toString(), containsString(s));


    }

    @Test
    public void should_show_book_details(){
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
        new BookList().Show();

        String s = new String("Cay S.Horstmann/Gary Cornell, 2004");
        assertThat(bytes.toString(), containsString(s));


    }

    @Test
    public void should_show_main_menu_and_choose_one(){

        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
        new MainMenu().show();

        String s = new String("Main menu");
        assertThat(bytes.toString(), containsString(s));

        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
        new Choice("1").doChoice();

        s = new String("1.Core Java");
        assertThat(bytes.toString(), containsString(s));

    }

    @After
    public void tearDown() throws Exception {
        System.setOut(console);
    }

}
