package com.twu.biblioteca;


import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

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
    public void WelcomeMessageTest(){
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
        bibliotecaApp.main(args);
        String s = new String("Welcome, Biblioteca is available!\n");

        assertEquals(s, bytes.toString());

    }
    @After
    public void tearDown() throws Exception {
        System.setOut(console);
    }

}
